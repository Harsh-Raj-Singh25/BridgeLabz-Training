package com.constructor.level1;

public class CarRentalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerName = "Anand";
		int carModel=2022;
		int rentalDays=10;
		
		// calling constructor and initializing the object
		CarRental u1=new CarRental(customerName, carModel, rentalDays);
		u1.totalCost();
		
	}

}
