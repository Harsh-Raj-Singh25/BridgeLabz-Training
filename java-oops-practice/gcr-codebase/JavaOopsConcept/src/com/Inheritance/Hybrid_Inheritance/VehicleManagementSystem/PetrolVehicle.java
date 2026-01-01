package com.Inheritance.Hybrid_Inheritance.VehicleManagementSystem;

//Subclass extending Vehicle and implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
	PetrolVehicle(String model, int maxSpeed) {
		super(model, maxSpeed);
	}

	@Override
	public void refuel() {
		showSpecs();
		System.out.println(" | Status: Refilling Petrol tank at the station.");
	}
}