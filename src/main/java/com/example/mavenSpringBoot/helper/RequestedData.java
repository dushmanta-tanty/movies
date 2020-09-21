package com.example.mavenSpringBoot.helper;

public class RequestedData<T> {

	T movies;
	
	public RequestedData(T movies) {
		this.movies = movies;
	}

	public T getMovies() {
		return movies;
	}

	public void setMovies(T movies) {
		this.movies = movies;
	}
}
