package com.Inheritance.Hybrid_Inheritance.VehicleManagementSystem;

//Subclass extending Vehicle only
class ElectricVehicle extends Vehicle {
	int batteryCapacity;

	ElectricVehicle(String model, int maxSpeed, int battery) {
		super(model, maxSpeed);
		this.batteryCapacity = battery;
	}

	void charge() {
		showSpecs();
		System.out.println(" | Status: Charging battery (" + batteryCapacity + " kWh).");
	}
}