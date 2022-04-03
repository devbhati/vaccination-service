package com.cpc.ghcms.vaccinationservice.dto;


import java.util.List;

import lombok.NoArgsConstructor;



@NoArgsConstructor
public class UserDTO {
	
	private String userID;
	
	private List<DriveAppointment> registeredVaccinationDrives;

	public String getUserID() {
		return userID;
	}

	public List<DriveAppointment> getRegisteredVaccinationDrives() {
		return registeredVaccinationDrives;
	}

	public void setRegisteredVaccinationDrives(List<DriveAppointment> registeredVaccinationDrives) {
		this.registeredVaccinationDrives = registeredVaccinationDrives;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	
}
