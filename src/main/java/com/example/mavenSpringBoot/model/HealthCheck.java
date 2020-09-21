package com.example.mavenSpringBoot.model;

public class HealthCheck {

	int port;
	String health;
	String status;
	public HealthCheck() {}
	public HealthCheck(int port, String health, String stat) {
		this.port = port;
		this.health = health;
		this.status = stat;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
