package com.functional_interface.defining_interfaces.smart_Device;

public class HomeAutomation {
	public static void main(String[] args) {
		SmartDevice[] devices = { new Light(), new AirConditioner() };

		// We can turn on ALL devices without knowing their specific class
		for (SmartDevice device : devices) {
			device.turnOn();
		}
	}
}