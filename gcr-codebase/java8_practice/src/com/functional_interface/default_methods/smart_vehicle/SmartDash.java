package com.functional_interface.default_methods.smart_vehicle;

public class SmartDash {
	public static void main(String[] args) {
		Dashboard tesla = new ElectricCar();
		tesla.displayBattery(85);

		Dashboard ford = new PetrolCar();
		ford.displayBattery(0);
	}
}

