package com.example.mavenSpringBoot.helper;

import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class ResponseBuilder {

	/**
	 * @param data
	 * @param status
	 * @return
	 * @description
	 * 	created for creating customized response for both success & error for an API
	 */
	public static <T> ResponseEntity<?> build(ServiceResponse<T> data, HttpStatus status) {
		ApiResponse<T> response = new ApiResponse<>();
		response.setTimestamp(new Timestamp(System.currentTimeMillis()).getTime());
		response.setRequestId(UUID.randomUUID().toString());
		response.setBody(data);
		response.setJsonapi(new JsonApi());
		return new ResponseEntity<ApiResponse<T>>(response,status);	
	}
	

	/**
	 * @param message
	 * @param code
	 * @return custom error for service layer
	 * @description
	 * 	build for creating customized error in the service layer
	 */
	public static CustomError error(String message, int code) {
		CustomError error = new CustomError();
		error.setCode(code);
		error.setMessage(message);
		return error;
	}
}

