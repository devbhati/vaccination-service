package com.cpc.ghcms.vaccinationservice.dto;

import java.util.List;

import com.cpc.ghcms.vaccinationservice.repo.entity.Location;
import com.cpc.ghcms.vaccinationservice.repo.entity.Timeline;

public class VaccinationDriveDTO {

	private String vaccDriveID;
	private LocationDto location;
	private List<TimelineDto> timelines;
	private String Vaccine;
	private boolean isDone;
	
	public String getVaccine() {
		return Vaccine;
	}
	public void setVaccine(String vaccine) {
		Vaccine = vaccine;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	public VaccinationDriveDTO() {
		super();
	}
	private boolean isCompleted;
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public VaccinationDriveDTO(String vaccDriveID, LocationDto location, List<TimelineDto> timelines) {
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
	public LocationDto getLocation() {
		return location;
	}
	public void setLocation(LocationDto location) {
		this.location = location;
	}
	public List<TimelineDto> getTimelines() {
		return timelines;
	}
	public void setTimelines(List<TimelineDto> timelines) {
		this.timelines = timelines;
	}
}
