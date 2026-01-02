package com.Encapsulation_Polymorphism_Interface_AbstractClass.VehicleRentalSystem;

class Bike extends Vehicle {
	public Bike(String vNum, double rate) {
		super(vNum, "Bike", rate);
	}

	@Override
	public double calculateRentalCost(int days) {
		return (getRentalRate() * days) * 0.9; // 10% discount for bikes to 
	} 
}