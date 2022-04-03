package com.cpc.ghcms.userservice.repository.entity;

import java.util.Date;

public class Timeline {
	
	private Date date;
	private Slot slot;
	public Timeline(Date date, Slot slot) {
		super();
		this.date = date;
		this.slot = slot;
	}
	public Timeline() {
		super();
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Slot getSlot() {
		return slot;
	}
	public void setSlot(Slot slot) {
		this.slot = slot;
	}

}
