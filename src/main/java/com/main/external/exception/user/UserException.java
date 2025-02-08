package com.main.external.exception.user;

public class UserException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UserException(String errorMessage) {
        super(errorMessage);
    }
	
	public UserException(String errorMessage,Throwable cause) {
        super(errorMessage,cause);
    }
	public UserException(Exception e) {
        super(e);
    }
}