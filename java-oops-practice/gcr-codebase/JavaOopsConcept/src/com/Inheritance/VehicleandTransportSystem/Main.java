package com.Inheritance.VehicleandTransportSystem;

public class Main {

	public static void main(String[] args) {
		// Demonstrate Polymorphism using an array of Vehicle type
        Vehicle[] myGarage = new Vehicle[3];

        // Storing different subclasses in the Vehicle array
        myGarage[0] = new Car(180, "Petrol", 5);
        myGarage[1] = new Motorcycle(120, "Petrol", 6);
        myGarage[2] = new Truck(90, "Diesel", 15);

        System.out.println("--- Transport System Status ---");
        
        // Dynamic Method calling through array
        for (Vehicle v : myGarage) {
            v.displayInfo(); 
        }
	}

}
