package com.cpc.ghcms.vaccinationservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cpc.ghcms.vaccinationservice.dto.BookApointmentDTO;
import com.cpc.ghcms.vaccinationservice.dto.VaccinationDriveDTO;

public interface VaccinationService {

	public ResponseEntity<List<VaccinationDriveDTO>> getAvailableVaccinationDrivesForLocAndIllness(String locationZip, String locationGeo, String illnessId);
	
	public ResponseEntity<String> bookAppointment(BookApointmentDTO bookAppointmentDTo);
}
