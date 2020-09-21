package com.example.mavenSpringBoot.model;

public class Movie {

	private String name;
	private String origin;
	private String genre;
	
	public Movie(String name, String origin, String genre) {
		super();
		this.name = name;
		this.origin = origin;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public String getOrigin() {
		return origin;
	}
	public String getGenre() {
		return genre;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
