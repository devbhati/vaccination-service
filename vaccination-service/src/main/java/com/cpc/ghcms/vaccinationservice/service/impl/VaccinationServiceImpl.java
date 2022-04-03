package com.cpc.ghcms.vaccinationservice.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cpc.ghcms.vaccinationservice.dto.BookApointmentDTO;
import com.cpc.ghcms.vaccinationservice.dto.DriveAppointment;
import com.cpc.ghcms.vaccinationservice.dto.UserDTO;
import com.cpc.ghcms.vaccinationservice.dto.VaccinationDriveDTO;
import com.cpc.ghcms.vaccinationservice.mapper.VaccinationDriveMapper;
import com.cpc.ghcms.vaccinationservice.repo.VaccinationDriveRepo;
import com.cpc.ghcms.vaccinationservice.repo.VaccinationRepo;
import com.cpc.ghcms.vaccinationservice.repo.entity.Vaccination;
import com.cpc.ghcms.vaccinationservice.repo.entity.VaccinationDrive;
import com.cpc.ghcms.vaccinationservice.service.VaccinationService;

@Service
public class VaccinationServiceImpl implements VaccinationService{
	
	@Autowired
	private VaccinationRepo vaccinationRepo;
	
	@Autowired
	private VaccinationDriveRepo vaccinationDriveRepo;
	
	@Autowired
	private VaccinationDriveMapper vaccinationDriveMapper;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResponseEntity<List<VaccinationDriveDTO>> getAvailableVaccinationDrivesForLocAndIllness(String locationZip, String locationGeo, String illnessId) {
		List<VaccinationDrive> vaccinationDrives = null;
		Vaccination vaccination = illnessId != null ? vaccinationRepo.findByIllnessesIllnessId(illnessId) : null;
	
		if(vaccination != null && locationZip != null) {
			vaccinationDrives = vaccination.getVaccinationDrives().stream().filter(vaccinationDrive -> !vaccinationDrive.isCompleted() && vaccinationDrive.getLocation().getZip().equals(locationZip)).collect(Collectors.toList());
		} else if(vaccination != null) {
			vaccinationDrives = vaccination.getVaccinationDrives().stream().filter(vaccinationDrive -> !vaccinationDrive.isCompleted()).collect(Collectors.toList());
		} else if(locationZip != null){
			vaccinationDrives = vaccinationDriveRepo.findByLocationZip(locationZip);
		}

		return new ResponseEntity(vaccinationDriveMapper.mapVaccinationDriveEntityToDtoList(vaccinationDrives), HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<String> bookAppointment(BookApointmentDTO bookAppointmentDTo) {
		String appointmentId = UUID.randomUUID().toString();
		UserDTO dto  = new UserDTO();
		dto.setUserID(bookAppointmentDTo.getUserId());
		DriveAppointment da = new DriveAppointment(appointmentId, bookAppointmentDTo.getTimeline());
		ArrayList<DriveAppointment> c = new ArrayList<DriveAppointment>();
		c.add(da);
		dto.setRegisteredVaccinationDrives(c);
		restTemplate.postForObject("http://user-service/api/update", dto, UserDTO.class);
		return new ResponseEntity<String>(appointmentId,HttpStatus.OK);
	}
	
}
