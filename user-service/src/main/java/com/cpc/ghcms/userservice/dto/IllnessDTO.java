package com.cpc.ghcms.userservice.dto;

public class IllnessDTO {
	
	private String illnessID;
	
	private LocationDTO location;

	public String getIllnessID() {
		return illnessID;
	}

	public void setIllnessID(String illnessID) {
		this.illnessID = illnessID;
	}

	public LocationDTO getLocation() {
		return location;
	}

	public void setLocation(LocationDTO location) {
		this.location = location;
	}

}
