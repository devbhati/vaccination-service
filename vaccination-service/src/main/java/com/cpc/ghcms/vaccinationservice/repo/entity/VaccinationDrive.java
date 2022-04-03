package com.cpc.ghcms.vaccinationservice.repo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import org.springframework.data.annotation.Id;

@Document(collection = "vaccinationDrive")
public class VaccinationDrive {
	
	@Id
	private String vaccDriveID;
	private Location location;
	private List<Timeline> timelines;
	private boolean isCompleted;
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public VaccinationDrive(String vaccDriveID, Location location, List<Timeline> timelines) {
		super();
		this.vaccDriveID = vaccDriveID;
		this.location = location;
		this.timelines = timelines;
	}
	public String getVaccDriveID() {
		return vaccDriveID;
	}
	public void setVaccDriveID(String vaccDriveID) {
		this.vaccDriveID = vaccDriveID;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public List<Timeline> getTimelines() {
		return timelines;
	}
	public void setTimelines(List<Timeline> timelines) {
		this.timelines = timelines;
	}

}
