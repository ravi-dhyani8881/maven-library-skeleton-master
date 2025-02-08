package com.main.external.response;

public class ErrorResponse {
	 
    private int statusCode;
    private String message;
    private String rootcause;
    private Throwable cause;
 
    public ErrorResponse(String message)
    {
        super();
        this.message = message;
    }

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRootcause() {
		return rootcause;
	}

	public void setRootcause(String rootcause) {
		this.rootcause = rootcause;
	}
	
	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}

	public ErrorResponse(int statusCode, String message) {
		super();
		
		this.statusCode = statusCode;
		this.message = message;
	}

	public ErrorResponse(int statusCode, String message, String rootcause) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.rootcause = rootcause;
	}

	public ErrorResponse(int statusCode, String message, Throwable cause) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.cause = cause;
	}
	
}