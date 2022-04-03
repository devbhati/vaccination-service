package com.cpc.ghcms.userservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cpc.ghcms.enums.UserRole;
import com.cpc.ghcms.userservice.dto.UserDTO;
import com.cpc.ghcms.userservice.mapper.UserMapper;
import com.cpc.ghcms.userservice.repository.UserRepo;
import com.cpc.ghcms.userservice.repository.entity.UserEntity;
import com.cpc.ghcms.userservice.service.UserService;
import com.netflix.discovery.EurekaClient;

@Service
@EnableDiscoveryClient
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	public UserMapper userMapper;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	   return builder.build();
	}

	@Override
	public UserDTO saveUser(UserDTO userDTO) {
		if(userDTO.getRole().get(0).getRole().equals(UserRole.HEALTH_PROVIDER_ADMIN.getRole())) {
			String hospitalID = userDTO.getRole().get(0).getPermissions().get("hid").toString();
			//Call hospital API to update admin count, send id as paramter from userDTO role
			restTemplate.getForObject("http://hospital-service/api/updateAdminCount?uniqueID="+hospitalID, String.class);
		}
		return userMapper.mapUserEntityToUserDTO(userRepo.save(userMapper.mapUserDTOToUserEntity(userDTO)));
	}

	@Override
	public UserDTO updateUser(UserDTO userDTO) throws Exception {
		Optional<UserEntity> optionalUser = userRepo.findById(userDTO.getUserID());
		if(optionalUser.isPresent()) {	
			if(userDTO.getRole() != null) {
				optionalUser.get().addRole(userMapper.mapUserDTOToUserEntity(userDTO).getRole().get(0));
			}
			if(userDTO.getIllness() != null) {
				optionalUser.get().addIllness(userMapper.mapUserDTOToUserEntity(userDTO).getIllness().get(0));
			}
			if(userDTO.getCompletedVaccinationDrives() != null) {
				optionalUser.get().addCompletedVaccinationDrives(userMapper.mapUserDTOToUserEntity(userDTO).getCompletedVaccinationDrives().get(0));
			}
			if(userDTO.getRegisteredVaccinationDrives() != null) {
				optionalUser.get().addRegisteredVaccinationDrives(userMapper.mapUserDTOToUserEntity(userDTO).getRegisteredVaccinationDrives().get(0));
			}
			return userMapper.mapUserEntityToUserDTO(userRepo.save(optionalUser.get()));
		} else {
			throw new Exception("User not found!!");
		}
	}

}
