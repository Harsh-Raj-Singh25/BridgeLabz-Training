package com.Encapsulation_Polymorphism_Interface_AbstractClass.RideHailingApplication;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		// POLYMORPHISM: Calculating fares for different vehicles using a generic list
		List<RideVehicle> pool = new java.util.ArrayList<>();
		pool.add(new RideCar("CAR-77", "Harsh", 12.0));
		pool.add(new RideBike("BIKE-01", "Namrata", 7.0));

		double tripDistance = 15.5;

		for (RideVehicle v : pool) {
			v.getVehicleDetails();
			// Polymorphic call to calculateFare
			System.out.println("Total Fare: Rs. " + v.calculateFare(tripDistance));

			// INTERFACE usage for GPS-enabled vehicles
			if (v instanceof GPS) {
				((GPS) v).updateLocation("New Market Square");
				System.out.println("Live Location: " + ((GPS) v).getCurrentLocation());
			}
			System.out.println("-------------------------");
		}
	}
}