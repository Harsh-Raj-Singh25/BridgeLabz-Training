package com.Inheritance.SingleInheritance.SmartHomeDevices;

public class Main {
	public static void main(String[] args) {
        Thermostat livingRoom = new Thermostat("T-1001", "Online", 22.5);
        livingRoom.displayStatus();
    }
}
