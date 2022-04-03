package com.cpc.ghcms.userservice.service;

import com.cpc.ghcms.userservice.dto.UserDTO;
import com.cpc.ghcms.userservice.repository.entity.UserEntity;

public interface UserService {	
	
	public UserDTO saveUser(UserDTO userDTO);
	
	public UserDTO updateUser(UserDTO userDTO) throws Exception;
	

}
