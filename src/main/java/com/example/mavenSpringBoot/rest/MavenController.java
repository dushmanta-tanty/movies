package com.example.mavenSpringBoot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mavenSpringBoot.helper.ResponseBuilder;
import com.example.mavenSpringBoot.helper.ServiceResponse;
import com.example.mavenSpringBoot.model.HealthCheck;


@RestController
@RequestMapping("/maven")
public class MavenController {

	@Value("${server.port}")
	int port;
	
	@GetMapping("/")
	public ResponseEntity<?> urlHome() {
		ServiceResponse<Object> res = new ServiceResponse<>();
		res.setData(new HealthCheck(port, "up", "running"));
		res.setStatus(HttpStatus.OK);
		return ResponseBuilder.build(res, HttpStatus.OK);
	}
}
