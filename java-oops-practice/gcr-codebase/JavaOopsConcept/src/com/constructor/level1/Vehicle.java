package com.constructor.level1;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000.0;

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹ " + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Rajesh Kumar", "Car");
        Vehicle vehicle2 = new Vehicle("Anita Singh", "Motorcycle");

        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Update registration fee
        Vehicle.updateRegistrationFee(1500.0);
        System.out.println("Updated Registration Fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
