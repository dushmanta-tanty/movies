package com.example.mavenSpringBoot.helper;

import org.springframework.http.HttpStatus;

public class ServiceResponse <T> {

	T data;
	T error;
	HttpStatus status;
	
	public ServiceResponse() {
	}
	
	public ServiceResponse(T data, T error, HttpStatus status) {
		super();
		this.data = data;
		this.error = error;
		this.status = status;
	}

	public T getData() {
		return data;
	}
	public T getError() {
		return error;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setData(T data) {
		this.data = data;
	}
	public void setError(T error) {
		this.error = error;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
}
