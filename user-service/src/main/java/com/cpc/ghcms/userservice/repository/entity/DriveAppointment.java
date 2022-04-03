package com.cpc.ghcms.userservice.repository.entity;

public class DriveAppointment {

	private String driveId;
	private Timeline timeline;
	public String getDriveId() {
		return driveId;
	}
	public void setDriveId(String driveId) {
		this.driveId = driveId;
	}
	public DriveAppointment() {
		super();
	}
	public Timeline getTimeline() {
		return timeline;
	}
	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}
	
}
