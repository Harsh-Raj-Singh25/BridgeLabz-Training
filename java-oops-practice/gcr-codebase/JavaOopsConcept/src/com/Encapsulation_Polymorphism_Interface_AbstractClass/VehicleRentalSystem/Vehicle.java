package com.Encapsulation_Polymorphism_Interface_AbstractClass.VehicleRentalSystem;

//Abstract Superclass
abstract class Vehicle {
	private String vehicleNumber;
	private String type;
	private double rentalRate;

	public Vehicle(String vehicleNumber, String type, double rentalRate) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
	}

	// Encapsulation: Getters
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	// Abstract method for rental cost
	public abstract double calculateRentalCost(int days);
}



