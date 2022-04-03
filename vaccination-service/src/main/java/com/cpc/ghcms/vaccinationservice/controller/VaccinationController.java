package com.cpc.ghcms.vaccinationservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cpc.ghcms.vaccinationservice.service.VaccinationService;
import com.cpc.ghcms.vaccinationservice.dto.BookApointmentDTO;
import com.cpc.ghcms.vaccinationservice.dto.VaccinationDriveDTO;

@RestController
@RequestMapping("/api/vaccination")
public class VaccinationController {
	
	@Autowired
	private VaccinationService vaccinationService;
	
	@GetMapping("/getAvailableVaccinationDrives")
	private ResponseEntity<List<VaccinationDriveDTO>> getAvailableVaccinationDrivesForLocAndIllness(@RequestParam(required = true) String locationZip, @RequestParam(required = true) String locationGeo,@RequestParam(required = true) String illnessId) {
		
		return vaccinationService.getAvailableVaccinationDrivesForLocAndIllness(locationZip, locationGeo, illnessId);
	}
	@PostMapping("/bookAppointment")
	private ResponseEntity<String> bookAppointment(@RequestBody BookApointmentDTO bookAppointmentDTo) {
		return vaccinationService.bookAppointment(bookAppointmentDTo);
	}
	
	//@PostMapping("/createVaccinationDrive")
//	private ResponseEntity<String> createVaccinationDrive()

}
