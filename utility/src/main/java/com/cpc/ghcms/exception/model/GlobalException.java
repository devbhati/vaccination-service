package com.cpc.ghcms.exception.model;

import com.cpc.ghcms.enums.CustomErrors;

public class GlobalException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * For default message configured for Application will be displayed.
	 */
	public GlobalException() {
        super(CustomErrors.INVALID_SERVER_EXCEPTION.getDescription());
    }
    public GlobalException(String message) {
        super(message);
    }

    public GlobalException(Throwable t) {
        super(t);
    }

}
