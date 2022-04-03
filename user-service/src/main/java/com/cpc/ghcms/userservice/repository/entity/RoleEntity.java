package com.cpc.ghcms.userservice.repository.entity;

import java.util.Map;

public class RoleEntity {
	
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
