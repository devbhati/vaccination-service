package com.cpc.ghcms.vaccinationservice.dto;

import java.util.Date;

import com.cpc.ghcms.vaccinationservice.repo.entity.Slot;

public class TimelineDto {

	public TimelineDto() {
		super();
	}
	private Date date;
	private SlotDto slot;
	public TimelineDto(Date date, SlotDto slot) {
		super();
		this.date = date;
		this.slot = slot;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public SlotDto getSlot() {
		return slot;
	}
	public void setSlot(SlotDto slot) {
		this.slot = slot;
	}
}
