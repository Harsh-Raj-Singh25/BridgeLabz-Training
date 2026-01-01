package com.Inheritance.VehicleandTransportSystem;

public class Vehicle {
	int maxSpeed;
	String fuelType;
	// Superclass Constructor
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    // method
	void displayInfo() {
		System.out.println("The vehicle's max speed is :"+maxSpeed+"\nIt's fuel type is :"+fuelType);
	}
}
