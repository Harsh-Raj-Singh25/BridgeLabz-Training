package com.Encapsulation_Polymorphism_Interface_AbstractClass.RideHailingApplication;

//INTERFACE: Behavior for location tracking
interface GPS {
	void updateLocation(String loc);
	String getCurrentLocation();
}
