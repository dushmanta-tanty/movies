package com.example.mavenSpringBoot.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.mavenSpringBoot.helper.RequestedData;
import com.example.mavenSpringBoot.helper.ServiceResponse;
import com.example.mavenSpringBoot.model.Movie;

@Service
public class MovieService <T> {

	private static final Logger LOGS = LoggerFactory.getLogger(MovieService.class);
	
	
	
	public ServiceResponse<Object> getMovies() {
		
		LOGS.info("Requested @ " + LocalDate.now());
		
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("Dhobo Ghat", "Bollywood", "Fiction"));
		movies.add(new Movie("Coco", "Hollywood", "Animation"));
		movies.add(new Movie("Avengers", "Hollywood", "Fiction"));
		
		RequestedData<Object> data = new RequestedData<Object>(movies);
		return new ServiceResponse<Object>(data, null, HttpStatus.OK);
	}
}
