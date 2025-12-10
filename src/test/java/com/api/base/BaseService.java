package com.api.base;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	private static final String BASE_URL = "https://restful-booker.herokuapp.com";
	private RequestSpecification requestSpecification;  	 	
	
	public BaseService() {
		requestSpecification = given().baseUri(BASE_URL);
	}
	
	protected void setCookieToken(String token) {
		requestSpecification.header("Cookie","token="+token);
	}
	
	protected Response postRequest(Object payload, String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);
	}
	
	protected Response putRequest(Object payload, String endPoint, int id) {
		return requestSpecification.contentType(ContentType.JSON).pathParam("id", id).body(payload).put(endPoint + "/{id}");
	}
	
	protected Response getRequest(String endPoint) {
		return requestSpecification.get(endPoint);
	}
	
	
}
