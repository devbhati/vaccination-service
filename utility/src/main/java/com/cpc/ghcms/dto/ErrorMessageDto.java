package com.cpc.ghcms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorMessageDto {

	@JsonProperty("code")
	private String code;

	@JsonProperty("message")
	private String message;

	public ErrorMessageDto code(String code) {
		this.code = code;
		return this;
	}

	public ErrorMessageDto(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
