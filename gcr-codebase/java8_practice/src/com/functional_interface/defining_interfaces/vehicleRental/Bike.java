package com.functional_interface.defining_interfaces.vehicleRental;

class Bike implements Rentable {
	public void rent(int days) {
		System.out.println("Bike rented for " + days + " days. Total: Rs." + (days * 500));
	}

	public void returnVehicle() {
		System.out.println("Bike returned. Checking for helmet...");
	}
}