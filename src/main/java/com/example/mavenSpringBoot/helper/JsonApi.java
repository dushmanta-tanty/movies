package com.example.mavenSpringBoot.helper;

public class JsonApi {
	private String version;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public JsonApi() {
		this.version = "1.0";
	}
}
