package com.functional_interface.defining_interfaces.vehicleRental;

class Car implements Rentable {
	public void rent(int days) {
		System.out.println("Car rented for " + days + " days. Total: Rs." + (days * 1200));
	}

	public void returnVehicle() {
		System.out.println("Car returned. Checking for fuel level...");
	}
}