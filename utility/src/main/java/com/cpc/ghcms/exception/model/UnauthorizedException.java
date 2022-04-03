package com.cpc.ghcms.exception.model;

import com.cpc.ghcms.enums.CustomErrors;

public class UnauthorizedException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	 

	 public UnauthorizedException() {
	        super(CustomErrors.UNAUTHORIZED_ERROR.getDescription());
	 }
   public UnauthorizedException(String message) {
       super(message);
   }

   public UnauthorizedException(Throwable t) {
       super(t);
   }
}
