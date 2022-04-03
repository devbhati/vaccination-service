package com.cpc.ghcms.userservice.repository.entity;

public class IllnessEntity {
	
	private String illnessID;
	
	private LocationEntity location;

	public String getIllnessID() {
		return illnessID;
	}

	public void setIllnessID(String illnessID) {
		this.illnessID = illnessID;
	}

	public LocationEntity getLocation() {
		return location;
	}

	public void setLocation(LocationEntity location) {
		this.location = location;
	}


}
