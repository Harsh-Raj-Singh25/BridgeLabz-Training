package com.Encapsulation_Polymorphism_Interface_AbstractClass.RideHailingApplication;

class RideBike extends RideVehicle {
	public RideBike(String id, String driver, double rate) {
		super(id, driver, rate);
	}

	@Override
	public double calculateFare(double distance) {
		return distance * getRate(); // LOGIC: Simple distance-based rate
	}
}
