package com.cpc.ghcms.hospitalservice.model.exception;

public class SecretCodeNotValidException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * For default message configured for Application will be displayed.
	 */
	public SecretCodeNotValidException() {
		super("SecretCodeNotValidException");
	}

	public SecretCodeNotValidException(String message) {
		super(message);
	}

	public SecretCodeNotValidException(String message,Throwable e) {
		super(message,e);
 	}

}
