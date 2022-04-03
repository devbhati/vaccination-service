package com.cpc.ghcms.vaccinationservice.dto;

public class SlotDto {
	private String fromTime;
	private String toTime;
	private String maxCount;
	private String registeredCount;
	public SlotDto() {
		super();
	}	
	public SlotDto(String fromTime, String toTime, String maxCount, String registeredCount) {
		super();
		this.fromTime = fromTime;
		this.toTime = toTime;
		this.maxCount = maxCount;
		this.registeredCount = registeredCount;
	}
	public String getFromTime() {
		return fromTime;
	}
	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}
	public String getToTime() {
		return toTime;
	}
	public void setToTime(String toTime) {
		this.toTime = toTime;
	}
	public String getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(String maxCount) {
		this.maxCount = maxCount;
	}
	public String getRegisteredCount() {
		return registeredCount;
	}
	public void setRegisteredCount(String registeredCount) {
		this.registeredCount = registeredCount;
	}
}
