package com.api.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingRequest {
	@JsonProperty("firstname")
	private String firstname;
	@JsonProperty("lastname")
    private String lastname;
	@JsonProperty("totalprice")
    private Integer totalprice;
	@JsonProperty("depositpaid")
    private Boolean depositpaid;
	@JsonProperty("additionalneeds")
    private String additionalneeds;
	@JsonProperty("bookingdates")
    private BookingDates bookingdates;
    
    public BookingRequest() {
    	
    }
    
    public BookingRequest(String firstname, String lastname, Integer totalprice, Boolean depositpaid,
			String additionalneeds, BookingDates bookingdates) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.totalprice = totalprice;
		this.depositpaid = depositpaid;
		this.additionalneeds = additionalneeds;
		this.bookingdates = bookingdates;
	}
    
 // 1. The inner model representing the "bookingdates" object
    public static class BookingDates {
        private String checkin;
        private String checkout;

        public BookingDates() {
        }
        
        public BookingDates(String checkin, String checkout) {
            this.checkin = checkin;
            this.checkout = checkout;
        }
        public String toString() {
            return "BookingDates [checkin=" + checkin + ", checkout=" + checkout + "]";
        }
        
        // Getters and Setters
        public String getCheckin() {
            return checkin;
        }

        public void setCheckin(String checkin) {
            this.checkin = checkin;
        }

        public String getCheckout() {
            return checkout;
        }

        public void setCheckout(String checkout) {
            this.checkout = checkout;
        }
    }

 	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(Integer totalprice) {
		this.totalprice = totalprice;
	}

	public Boolean getDepositpaid() {
		return depositpaid;
	}

	public void setDepositpaid(Boolean depositpaid) {
		this.depositpaid = depositpaid;
	}

	public String getAdditionalneeds() {
		return additionalneeds;
	}

	public void setAdditionalneeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}

	@Override
	public String toString() {
		return "BookingRequest [firstname=" + firstname + ", lastname=" + lastname + ", totalprice=" + totalprice
				+ ", depositpaid=" + depositpaid + ", additionalneeds=" + additionalneeds + "]";
	}

	public static class Builder
	{
		private String firstname;
	    private String lastname;
	    private Integer totalprice;
	    private Boolean depositpaid;
	    private String additionalneeds;
	    private BookingDates bookingdates;
	    
	    public Builder firstname(String firstname) {
	    	this.firstname = firstname;
	    	return this;
	    }
	    
	    public Builder lastname(String lastname) {
	    	this.lastname = lastname;
	    	return this;
	    }
	    
	    public Builder totalprice(Integer totalprice) {
	    	this.totalprice = totalprice;
	    	return this;
	    }
	    
	    public Builder depositpaid(Boolean depositpaid) {
	    	this.depositpaid = depositpaid;
	    	return this;
	    }
	    
	    public Builder additionalneeds(String additionalneeds) {
	    	this.additionalneeds = additionalneeds;
	    	return this;
	    }
	    
	    public Builder bookingdates(BookingDates bookingdates) {
	    	this.bookingdates = bookingdates;
	    	return this;
	    }
	    
	    public BookingRequest  build() {
	    	BookingRequest bookingRequest = new BookingRequest(firstname,lastname,totalprice,depositpaid,additionalneeds,bookingdates);
	    	return bookingRequest;
	    }
	}
}
