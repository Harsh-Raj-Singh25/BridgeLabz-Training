package com.functional_interface.default_methods.smart_vehicle;

interface Dashboard {
	void displaySpeed(int speed);

	// New feature for Electric Vehicles
	default void displayBattery(int level) {
		System.out.println("Battery Status: Feature not supported for this vehicle type.");
	}
}





