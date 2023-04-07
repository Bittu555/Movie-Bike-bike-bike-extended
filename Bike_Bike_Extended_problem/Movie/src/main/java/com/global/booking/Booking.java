package com.global.booking;

import com.global.customer.Customer;
import com.global.movie.Movie;

public class Booking {
	//bookingId, booking_Date, seatNo, amt  ,customerID ,movieId
private int bookingId;
private String booking_Date;
private int seatNo;
private String amt;
private int customerID;
private int movieID;


public Booking() {
	
}


public Booking(int bookingId, String booking_Date, int seatNo, String amt, int customerID, int movieID) {
	super();
	this.bookingId = bookingId;
	this.booking_Date = booking_Date;
	this.seatNo = seatNo;
	this.amt = amt;
	this.customerID = customerID;
	this.movieID = movieID;
}


public int getBookingId() {
	return bookingId;
}


public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}


public String getBooking_Date() {
	return booking_Date;
}


public void setBooking_Date(String booking_Date) {
	this.booking_Date = booking_Date;
}


public int getSeatNo() {
	return seatNo;
}


public void setSeatNo(int seatNo) {
	this.seatNo = seatNo;
}


public String getAmt() {
	return amt;
}


public void setAmt(String amt) {
	this.amt = amt;
}


public int getCustomerID() {
	return customerID;
}


public void setCustomerID(int customerID) {
	this.customerID = customerID;
}


public int getMovie() {
	return movieID;
}


public void setMovie(int movieID) {
	this.movieID = movieID;
}

}
