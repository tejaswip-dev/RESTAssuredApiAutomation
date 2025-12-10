package com.api.base;

import com.api.models.request.BookingRequest;

import io.restassured.response.Response;

public class BookingService extends BaseService{

	private static final String BASE_PATH = "/booking";
	
	public Response getBooking() {
		return getRequest(BASE_PATH);
	}
	
	public Response postBooking(BookingRequest payload) {
		return postRequest(payload,BASE_PATH);
	}
	
	public Response updateBooking(String token, BookingRequest payload, int id) {
		setCookieToken(token);
		return putRequest(payload,BASE_PATH,id);
	}
}
