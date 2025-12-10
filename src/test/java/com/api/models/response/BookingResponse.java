package com.api.models.response;

public class BookingResponse {

	private Integer bookingid;

	public BookingResponse() {
		
	}
	
	public Integer getBookingid() {
		return bookingid;
	}

	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}

	@Override
	public String toString() {
		return "BookingResponse [bookingid=" + bookingid + "]";
	}

	public BookingResponse(Integer bookingid) {
		super();
		this.bookingid = bookingid;
	}

}
