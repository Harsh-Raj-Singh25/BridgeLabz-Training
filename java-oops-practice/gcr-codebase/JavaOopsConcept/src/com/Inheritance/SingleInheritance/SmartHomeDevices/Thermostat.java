package com.Inheritance.SingleInheritance.SmartHomeDevices;

public class Thermostat extends Device {
	double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Task: Implement displayStatus()
    void displayStatus() {
        System.out.println("--- Device Status Report ---");
        System.out.println("ID: " + deviceId);
        System.out.println("Connection: " + status);
        System.out.println("Current Temperature Setting: " + temperatureSetting + "°C");
    }
}
