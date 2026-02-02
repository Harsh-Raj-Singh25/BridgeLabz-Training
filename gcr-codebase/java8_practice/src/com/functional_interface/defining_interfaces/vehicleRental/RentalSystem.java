package com.functional_interface.defining_interfaces.vehicleRental;

public class RentalSystem {
	public static void main(String[] args) {
		System.out.println("WELCOME TO RENTAL SYSTEM");
		System.out.println("------------------------");
		Rentable myRide = new Bike();
		myRide.rent(3);
		myRide.returnVehicle();
		System.out.println("-------------------------");
		Rentable myRide2=new Car();
		myRide2.rent(5);
		myRide2.returnVehicle();
	}
}