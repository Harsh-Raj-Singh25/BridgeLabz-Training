package com.Inheritance.VehicleandTransportSystem;

public class Car extends Vehicle {
	int seatCapacity;
	Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Send data to parent constructor
        this.seatCapacity = seatCapacity;
    }
	
	@Override
	void displayInfo() {
		System.out.println("The car's seating capacity is :"+ seatCapacity + "\n and its fuelType is "+ fuelType);
	}
}
