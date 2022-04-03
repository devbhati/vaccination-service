package com.cpc.ghcms.userservice.dto;

import java.util.Map;

public class RoleDTO {
	
	private String role;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Map<String, Object> getPermissions() {
		return permissions;
	}

	public void setPermissions(Map<String, Object> permissions) {
		this.permissions = permissions;
	}

	private Map<String, Object> permissions; 

}
