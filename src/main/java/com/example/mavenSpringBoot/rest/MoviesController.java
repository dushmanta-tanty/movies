package com.example.mavenSpringBoot.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mavenSpringBoot.helper.ResponseBuilder;
import com.example.mavenSpringBoot.helper.ServiceResponse;
import com.example.mavenSpringBoot.services.MovieService;

@RestController
@CrossOrigin
@RequestMapping("/movies")
public class MoviesController <T> {

	@SuppressWarnings("rawtypes")
	@Autowired
	MovieService movieService;
	
	@GetMapping("/")
	public ResponseEntity<?> getMovies() {
		@SuppressWarnings("unchecked")
		ServiceResponse<Object> response = movieService.getMovies();
		return ResponseBuilder.build(response, response.getStatus());
	}
}
