package com.cpc.ghcms.userservice.mapper;

import org.mapstruct.Mapper;

import com.cpc.ghcms.userservice.dto.IllnessDTO;
import com.cpc.ghcms.userservice.dto.RoleDTO;
import com.cpc.ghcms.userservice.dto.UserDTO;
import com.cpc.ghcms.userservice.repository.entity.IllnessEntity;
import com.cpc.ghcms.userservice.repository.entity.RoleEntity;
import com.cpc.ghcms.userservice.repository.entity.UserEntity;

@Mapper
public interface UserMapper {
	
	public UserEntity mapUserDTOToUserEntity(UserDTO userDTO);
	public UserDTO mapUserEntityToUserDTO(UserEntity userEntity);
	public IllnessEntity mapIllnessDTOToIllnessEntity(IllnessDTO illnessDTO);
	public RoleEntity mapRoleDTOToRoleEntity(RoleDTO roleDTO);
	public RoleDTO mapRoleEntityToRoleDTO(RoleEntity roleDTO);

}
