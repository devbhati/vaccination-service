package com.cpc.ghcms.hospitalservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cpc.ghcms.hospitalservice.dto.HospitalDTO;
import com.cpc.ghcms.hospitalservice.service.impl.HospitalServiceImpl;

//import io.swagger.annotations.Api;

//@Api(tags = { "Hospital Controller APIs" })
@RestController
public class HospitalController {
	
	@Autowired
	private HospitalServiceImpl hospitalService;
	
	@GetMapping("/api/getHospital")
	public ResponseEntity<HospitalDTO> getAllIllness(@RequestParam String secretCode) {
		return new ResponseEntity<HospitalDTO>(hospitalService.getHospital(secretCode), HttpStatus.OK);
	}
	
	@PostMapping("/api/createHospital")
	public ResponseEntity<HospitalDTO> createIllness(@RequestBody HospitalDTO hospitalDTO) {
		return new ResponseEntity<HospitalDTO>(hospitalService.createHospital(hospitalDTO), HttpStatus.OK);
	}
	
	@GetMapping("api/updateAdminCount")
	public ResponseEntity<HospitalDTO> updateAdminCount(@RequestParam String uniqueID) {
		return new ResponseEntity<HospitalDTO>(hospitalService.updateAdminCount(uniqueID), HttpStatus.OK);
	}

}
