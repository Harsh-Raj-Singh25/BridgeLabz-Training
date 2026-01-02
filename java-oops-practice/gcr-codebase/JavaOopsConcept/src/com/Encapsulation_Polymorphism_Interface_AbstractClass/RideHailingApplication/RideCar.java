package com.Encapsulation_Polymorphism_Interface_AbstractClass.RideHailingApplication;

// class inheriting rideVehicle class and implementing the interface GPS
class RideCar extends RideVehicle implements GPS {
	private String location = "Home";

	public RideCar(String id, String driver, double rate) {
		super(id, driver, rate);
	}

	@Override
	public double calculateFare(double distance) {
		// LOGIC: Distance * rate + fixed service fee of 30
		return (distance * getRate()) + 30.0;
	}

	@Override
	public void updateLocation(String loc) {
		this.location = loc;
	}

	@Override
	public String getCurrentLocation() {
		return location;
	}
}