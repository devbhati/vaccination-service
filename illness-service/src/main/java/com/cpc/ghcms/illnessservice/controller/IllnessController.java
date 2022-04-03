package com.cpc.ghcms.illnessservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cpc.ghcms.illnessservice.dto.IllnessDTO;
import com.cpc.ghcms.illnessservice.repository.entity.IllnessEntity;
import com.cpc.ghcms.illnessservice.service.impl.IllnessServiceImpl;

import io.swagger.annotations.Api;



@Api(tags = { "Illness Controller APIs" })
@RestController
public class IllnessController {
	
	@Autowired
	private IllnessServiceImpl illnessService;
	
	@PostMapping("/api/create")
	public ResponseEntity<IllnessDTO> reportIllness(@RequestBody IllnessDTO illnessDTO) {
		return new ResponseEntity<IllnessDTO>(illnessService.reportIllness(illnessDTO), HttpStatus.OK);
	}
	
	@GetMapping("/api/getAllIllness")
	public ResponseEntity<List<IllnessDTO>> getAllIllness() {
		return new ResponseEntity<List<IllnessDTO>>(illnessService.getAllIllness(), HttpStatus.OK);
	}

}
