package com.functional_interface.defining_interfaces.smart_Device;

class AirConditioner implements SmartDevice {
	public void turnOn() {
		System.out.println("AC: Compressor started. Setting temp to 24°C.");
	}

	public void turnOff() {
		System.out.println("AC: Compressor stopped.");
	}
}