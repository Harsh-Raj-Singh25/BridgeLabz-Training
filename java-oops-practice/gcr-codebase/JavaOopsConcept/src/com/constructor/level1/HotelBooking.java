package com.constructor.level1;

public class HotelBooking {
	// attributes
	String guestName;
	String roomType;
	int nights;
	
	// default constructor
	HotelBooking(){
		guestName="Harsh";
		roomType="Presidential Suite";
		nights=1;
	}
	
	// parameterized constructor:
	HotelBooking(String guestName,String roomType,int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	
	// Copy Constructor
	HotelBooking(HotelBooking previousOne){
		this.guestName=previousOne.guestName;
		this.roomType=previousOne.roomType;
		this.nights=previousOne.nights;
	}
	
	void displayBooking() {
		System.out.println("The guest name is : "+ guestName);
		System.out.println("Room Type is: "+ roomType);
		System.out.println("Nights Booked is : "+ nights);
	}
}
