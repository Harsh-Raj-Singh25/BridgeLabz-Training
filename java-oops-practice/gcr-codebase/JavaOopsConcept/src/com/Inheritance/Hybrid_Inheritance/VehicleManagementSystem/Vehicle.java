package com.Inheritance.Hybrid_Inheritance.VehicleManagementSystem;

//Superclass
class Vehicle {
	String model;
	int maxSpeed;

	Vehicle(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	void showSpecs() {
		System.out.print("Model: " + model + " | Max Speed: " + maxSpeed + " km/h");
	}
}