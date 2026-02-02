package com.functional_interface.default_methods.smart_vehicle;

class ElectricCar implements Dashboard {
	public void displaySpeed(int speed) {
		System.out.println("EV Speed: " + speed + " km/h");
	}

	@Override
	public void displayBattery(int level) {
		System.out.println("EV Battery: " + level + "% remaining");
	}
}