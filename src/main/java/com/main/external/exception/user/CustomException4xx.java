package com.main.external.exception.user;

public class CustomException4xx extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CustomException4xx(String errorMessage) {
        super(errorMessage);
    }
	
	public CustomException4xx(String errorMessage,Throwable cause) {
        super(errorMessage,cause);
    }
	public CustomException4xx(Exception e) {
        super(e);
    }
}