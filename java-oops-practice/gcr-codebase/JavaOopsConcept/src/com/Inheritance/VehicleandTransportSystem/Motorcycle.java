package com.Inheritance.VehicleandTransportSystem;

public class Motorcycle extends Vehicle{
	int gears;
	// constructor
	Motorcycle(int maxSpeed, String fuelType, int gears) {
        super(maxSpeed, fuelType);
        this.gears = gears;
    }
	
	@Override
	void displayInfo() {
		System.out.println("The bike has "+gears+" gears and it's max speed is :" +maxSpeed);
	}

}
