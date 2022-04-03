package com.cpc.ghcms.userservice.dto;


import java.util.List;

import com.cpc.ghcms.userservice.repository.entity.DriveAppointment;

import lombok.NoArgsConstructor;



@NoArgsConstructor
public class UserDTO {
	
	private String userID;
	
	private List<IllnessDTO> illness;
	
	private List<RoleDTO> role;
	
	private String aadhar;
	
	private List<DriveAppointment> registeredVaccinationDrives;
	 
	private List<DriveAppointment> completedVaccinationDrives;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public List<IllnessDTO> getIllness() {
		return illness;
	}

	public void setIllness(List<IllnessDTO> illness) {
		this.illness = illness;
	}

	public List<RoleDTO> getRole() {
		return role;
	}

	public void setRole(List<RoleDTO> role) {
		this.role = role;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public List<DriveAppointment> getRegisteredVaccinationDrives() {
		return registeredVaccinationDrives;
	}

	public void setRegisteredVaccinationDrives(List<DriveAppointment> registeredVaccinationDrives) {
		this.registeredVaccinationDrives = registeredVaccinationDrives;
	}

	public List<DriveAppointment> getCompletedVaccinationDrives() {
		return completedVaccinationDrives;
	}

	public void setCompletedVaccinationDrives(List<DriveAppointment> completedVaccinationDrives) {
		this.completedVaccinationDrives = completedVaccinationDrives;
	}

	
}
