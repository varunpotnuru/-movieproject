package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class OnlineException {
	
	@ExceptionHandler(value= {AdminException.class})
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
    public ErrorDetails handleException(Exception ex)
    {
		return new ErrorDetails(ex.getMessage());
    }
}
