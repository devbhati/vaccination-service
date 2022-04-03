package com.cpc.ghcms.exception.model;

import com.cpc.ghcms.enums.CustomErrors;

public class AccessForbiddenException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * For default message configured for Application will be displayed.
	 */
	public AccessForbiddenException() {
		super(CustomErrors.ACCESS_FORBIDDEN_ERROR.getDescription());
	}

	public AccessForbiddenException(String message) {
		super(message);
	}

	public AccessForbiddenException(String message,Throwable e) {
		super(message,e);
 	}

}
