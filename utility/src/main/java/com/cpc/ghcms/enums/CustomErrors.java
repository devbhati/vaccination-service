package com.cpc.ghcms.enums;

public enum CustomErrors {

	INVALID_SERVER_EXCEPTION("GHCMS01", "Internal Server Error"),
	INVALID_SESSIONEXCEPTION("GHCMS02", "Current session is invalid"),
	ACCESS_FORBIDDEN_ERROR("GHCMS03", "Access Forbidden."),
	UNAUTHORIZED_ERROR("GHCMS04", "UnAuthorized. Please login again!");
	private String code;

	/** The description. */
	private String description;

	private CustomErrors(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
