package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import com.api.base.AuthService;
import com.api.base.BookingService;
import com.api.models.request.BookingRequest;
import com.api.models.request.LoginRequest;
import com.api.models.response.BookingResponse;
import com.api.models.response.LoginResponse;

import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;

public class UpdateBookingTest {

	@Test
	public void updateBookingTest() {
	AuthService authService = new AuthService();
	Response response = authService.login(new LoginRequest("admin", "password123"));
	LoginResponse loginResponse = response.as(LoginResponse.class);
	System.out.println(response.asPrettyString());
	
	System.out.println("----------------------------------------------------------");
	
	BookingService bookingService = new BookingService();
	response = bookingService.getBooking();
	System.out.println(response.asPrettyString());
	  List<BookingResponse> bookingList= response.as(new
	  TypeRef<List<BookingResponse>>() {});
	  Assert.assertFalse(bookingList.isEmpty());
	  Assert.assertTrue(bookingList.size() > 0);
	 
	System.out.println("----------------------------------------------------------"); 
	
	BookingRequest.BookingDates date1 = new BookingRequest.BookingDates("2024-02-01", "2024-02-10");
	BookingRequest bookingRequest = new BookingRequest.Builder()
			.firstname("tejal")
			.lastname("Bht")
			.totalprice(561)
			.depositpaid(true)
			.additionalneeds("dinner")
			.bookingdates(date1)
			.build();
	response = bookingService.postBooking(bookingRequest);
	System.out.println(response.asPrettyString());
	Integer firstBookingId = response.jsonPath().getInt("bookingid");
	
	System.out.println("----------------------------------------------------------");
	
	BookingRequest.BookingDates dates = new BookingRequest.BookingDates("2024-04-01", "2024-04-10");
	BookingRequest bookingRequest1 = new BookingRequest.Builder()
			.firstname("tejas")
			.lastname("Bhat")
			.depositpaid(true)
			.totalprice(111)
			.additionalneeds("breakfast")
			.bookingdates(dates)
			.build();
	
	response = bookingService.updateBooking(loginResponse.getToken(), bookingRequest1,firstBookingId);
	//System.out.println("Raw Response Body: " + response.getBody().asString());
	System.out.println(response.asPrettyString()); 
	System.out.println("----------------------------------------------------------");
	}
}
