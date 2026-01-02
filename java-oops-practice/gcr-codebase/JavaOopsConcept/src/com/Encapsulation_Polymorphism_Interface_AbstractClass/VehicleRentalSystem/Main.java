package com.Encapsulation_Polymorphism_Interface_AbstractClass.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Car("BR-31-2502", 2000, "INS-CAR-99")); // the cost is (2000 * 3=6000). Since it is Insurable, it also calculates insurance (2000 * 0.05=100)).
        fleet.add(new Bike("BR-31-5000", 50000)); // in this no insurance will be calculated.

        for (Vehicle v : fleet) {
            System.out.println("Vehicle: " + v.getVehicleNumber() + " | Cost: " + v.calculateRentalCost(3)); 
            if (v instanceof Insurable) {
                System.out.println("Insurance: " + ((Insurable) v).calculateInsurance());
            }
        }
    }
}