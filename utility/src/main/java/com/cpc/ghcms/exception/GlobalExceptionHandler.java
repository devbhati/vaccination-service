package com.cpc.ghcms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cpc.ghcms.dto.ErrorMessageDto;
import com.cpc.ghcms.exception.model.GlobalException;
import com.cpc.ghcms.exception.model.UnauthorizedException;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({ GlobalException.class })
	public ResponseEntity<ErrorMessageDto> handleGlobalError(GlobalException ex) {
		return createResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()), ex.getMessage());
	}
	
	@ExceptionHandler({ UnauthorizedException.class })
	public ResponseEntity<ErrorMessageDto> handleAccessForBiddenException(UnauthorizedException ex) {
		return createResponseEntity(HttpStatus.UNAUTHORIZED,String.valueOf(HttpStatus.UNAUTHORIZED.value()), ex.getMessage());
	}
	
	private ResponseEntity<ErrorMessageDto> createResponseEntity(HttpStatus httpStatus, String responseCode,
			String message) {
		ErrorMessageDto errorMessageDTO = new ErrorMessageDto(responseCode,message);
		errorMessageDTO.setCode(responseCode);
		errorMessageDTO.setMessage(message);
		return ResponseEntity.status(httpStatus).body(errorMessageDTO);
	}
}
