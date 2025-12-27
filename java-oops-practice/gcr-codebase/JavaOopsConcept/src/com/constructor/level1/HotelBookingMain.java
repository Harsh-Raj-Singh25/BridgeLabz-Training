package com.constructor.level1;

public class HotelBookingMain {
	public static void main(String [] args) {
		// default booking
		HotelBooking g1=new HotelBooking();
		g1.displayBooking();
		
		// parameterized booking
		HotelBooking g2= new HotelBooking("Akash","1R",4);
		g2.displayBooking();
		
		// copy Booking
		HotelBooking g3=new HotelBooking(g2);
		g3.displayBooking();
	}

}
