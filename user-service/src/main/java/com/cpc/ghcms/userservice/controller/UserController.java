package com.cpc.ghcms.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cpc.ghcms.userservice.dto.AadharDTO;
import com.cpc.ghcms.userservice.dto.UserDTO;
import com.cpc.ghcms.userservice.service.impl.UserServiceImpl;

import io.swagger.annotations.Api;



@Api(tags = { "User Controller APIs" })
@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping("/api/create")
	public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO) {
		return new ResponseEntity<UserDTO>(userService.saveUser(userDTO), HttpStatus.OK);
	}
	
	@PostMapping("/api/update")
	public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO) throws Exception {
		return new ResponseEntity<UserDTO>(userService.updateUser(userDTO), HttpStatus.OK);
	}
	
	@GetMapping("/api/aadhar/validate")
	public boolean validateAadhar(@RequestBody AadharDTO aadhar) {
		if(aadhar.getAadhar().length() == 12) return true;
		return false;
	}

}
