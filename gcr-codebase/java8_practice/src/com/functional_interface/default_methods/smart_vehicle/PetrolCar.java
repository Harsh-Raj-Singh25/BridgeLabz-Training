package com.functional_interface.default_methods.smart_vehicle;

class PetrolCar implements Dashboard {
	public void displaySpeed(int speed) {
		System.out.println("Petrol Car Speed: " + speed + " km/h");
	}
	// displayBattery is inherited but provides the "not supported" message
}
