package com.cpc.ghcms.enums;


public enum UserRole {
	CITIZEN("Citizen"),
	HEALTH_PROVIDER_ADMIN("HP_Admin"),
	HEALTH_MINISTRY_OFFICIAL("Health_Ministry");
	
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	private UserRole(String role) {
		this.role = role;
	}

	private UserRole() {
	}
}
