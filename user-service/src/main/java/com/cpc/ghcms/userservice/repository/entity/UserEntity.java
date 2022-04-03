package com.cpc.ghcms.userservice.repository.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "user")
public class UserEntity {
	
	@Id
	private String userID;
	private List<IllnessEntity> illness;
	private List<RoleEntity> role;
	private String aadhar;
	private List<DriveAppointment> registeredVaccinationDrives;
	private List<DriveAppointment> completedVaccinationDrives;
	
	public void addIllness(IllnessEntity illnessEntity) {
		if(this.illness == null) {
			this.illness = new ArrayList<IllnessEntity>();
		}
		this.illness.add(illnessEntity);
	}
	
	public void addRole(RoleEntity roleEntity) {
		if(this.role == null) {
			this.role = new ArrayList<RoleEntity>();
		}
		this.role.add(roleEntity);
	}
	
	public void addRegisteredVaccinationDrives(DriveAppointment registeredVaccinationDrives) {
		if(this.registeredVaccinationDrives == null) {
			this.registeredVaccinationDrives = new ArrayList<DriveAppointment>();
		}
		this.registeredVaccinationDrives.add(registeredVaccinationDrives);
	}
	
	public void addCompletedVaccinationDrives(DriveAppointment completedVaccinationDrives) {
		if(this.completedVaccinationDrives == null) {
			this.completedVaccinationDrives = new ArrayList<DriveAppointment>();
		}
		this.completedVaccinationDrives.add(completedVaccinationDrives);
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public List<IllnessEntity> getIllness() {
		return illness;
	}
	public void setIllness(List<IllnessEntity> illness) {
		this.illness = illness;
	}
	public List<RoleEntity> getRole() {
		return role;
	}
	public void setRole(List<RoleEntity> role) {
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
