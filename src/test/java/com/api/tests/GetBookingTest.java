package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.BookingService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class GetBookingTest {
    
	@Test
	public void getBookingInfoTest() {
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("admin", "password123"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		
		BookingService bookingService = new BookingService();
		response = bookingService.getBooking();
		System.out.println(response.asPrettyString());
	}

}
