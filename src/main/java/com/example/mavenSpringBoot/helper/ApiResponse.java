package com.example.mavenSpringBoot.helper;


public class ApiResponse <T> {

	private long timestamp;
	private String type = "movies";
	private String requestId;
	private ServiceResponse<T> body;
	private JsonApi jsonapi;
	public long getTimestamp() {
		return timestamp;
	}
	public String getType() {
		return type;
	}
	public String getRequestId() {
		return requestId;
	}
	public ServiceResponse<T> getBody() {
		return body;
	}
	public JsonApi getJsonapi() {
		return jsonapi;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public void setBody(ServiceResponse<T> body) {
		this.body = body;
	}
	public void setJsonapi(JsonApi jsonapi) {
		this.jsonapi = jsonapi;
	}
}
