package com.Inheritance.VehicleandTransportSystem;

public class Truck extends Vehicle {
	int loadCapacity;
	
	Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
	
	@Override
	void displayInfo() {
		System.out.println("The truck's capacity is :"+ loadCapacity+"and it has a fuelType:"+fuelType);
	}
}
