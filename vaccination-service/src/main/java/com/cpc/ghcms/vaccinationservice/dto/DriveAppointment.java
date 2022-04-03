package com.cpc.ghcms.vaccinationservice.dto;

import com.cpc.ghcms.vaccinationservice.repo.entity.Timeline;

public class DriveAppointment {

	private String driveId;
	private Timeline timeline;
	public DriveAppointment(String driveId, Timeline timeline) {
		super();
		this.driveId = driveId;
		this.timeline = timeline;
	}
	public DriveAppointment() {
		super();
	}
	public String getDriveId() {
		return driveId;
	}
	public void setDriveId(String driveId) {
		this.driveId = driveId;
	}
	public Timeline getTimeline() {
		return timeline;
	}
	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}
	
}
