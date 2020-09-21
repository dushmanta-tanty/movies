package com.example.mavenSpringBoot.helper;

public class CustomError {
	private int code;
	private String message;
	private String status;

	public CustomError() {
		this.status = "failure";
	}
	
	public CustomError(int code, String message, String status) {
		super();
		this.code = code;
		this.message = message;
		this.status = status;
	}

	public int getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	public String getStatus() {
		return status;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
