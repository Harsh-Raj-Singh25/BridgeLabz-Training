package com.Encapsulation_Polymorphism_Interface_AbstractClass.RideHailingApplication;

//ABSTRACT CLASS: General Vehicle template
abstract class RideVehicle {
	// ENCAPSULATION: Sensitive driver/vehicle data hidden
	private String vehicleId;
	private String driverName;
	private double ratePerKm;

	public RideVehicle(String id, String driver, double rate) {
		this.vehicleId = id;
		this.driverName = driver;
		this.ratePerKm = rate;
	}
	

	public String getDriverName() {
		return driverName;
	}


	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	public double getRate() {
		return ratePerKm;
	}

	// ABSTRACT METHOD: Fare depends on the vehicle type
	public abstract double calculateFare(double distance);

	public void getVehicleDetails() {
		System.out.println("Driver: " + driverName + " [" + vehicleId + "]");
	}
}
