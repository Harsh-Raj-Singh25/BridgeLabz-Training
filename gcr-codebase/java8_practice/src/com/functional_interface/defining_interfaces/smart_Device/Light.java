package com.functional_interface.defining_interfaces.smart_Device;

class Light implements SmartDevice {
	public void turnOn() {
		System.out.println("Light: LED turned on to 100% brightness.");
	}

	public void turnOff() {
		System.out.println("Light: LED turned off.");
	}
}
