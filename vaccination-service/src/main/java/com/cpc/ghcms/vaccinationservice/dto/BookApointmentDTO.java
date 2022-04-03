package com.cpc.ghcms.vaccinationservice.dto;

import com.cpc.ghcms.vaccinationservice.repo.entity.Timeline;

public class BookApointmentDTO {

	private String userId;
	private String driveId;
	private Timeline timeline;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
