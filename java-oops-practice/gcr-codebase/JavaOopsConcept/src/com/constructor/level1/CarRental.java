package com.constructor.level1;

public class CarRental {
	// attributes:
	String customerName;
	int carModel;
	int rentalDays;
	
	// constructor
	CarRental(String customerName, int carModel, int rentalDays){
		this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
	}
	
	// method to calculate totalcost
	void totalCost() {
		System.out.println("The customer : "+customerName+" who rented "+carModel+" model car has to pay " + rentalDays*500);
	}
	
}
