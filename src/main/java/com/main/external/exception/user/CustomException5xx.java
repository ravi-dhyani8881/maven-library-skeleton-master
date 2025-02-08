package com.main.external.exception.user;

public class CustomException5xx extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CustomException5xx(String errorMessage) {
        super(errorMessage);
    }
	
	public CustomException5xx(String errorMessage,Throwable cause) {
        super(errorMessage,cause);
    }
	public CustomException5xx(Exception e) {
        super(e);
    }
}