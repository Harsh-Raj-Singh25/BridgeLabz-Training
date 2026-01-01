package com.Inheritance.SingleInheritance.SmartHomeDevices;

public class Device {
	String deviceId;
    String status; // e.g., "Online", "Offline"

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}
