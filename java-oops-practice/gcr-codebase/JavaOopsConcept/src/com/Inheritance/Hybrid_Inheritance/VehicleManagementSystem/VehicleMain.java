package com.Inheritance.Hybrid_Inheritance.VehicleManagementSystem;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetrolVehicle car = new PetrolVehicle("Ford Mustang", 250);
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 225, 75);

        System.out.println("--- Vehicle Operations ---");
        car.refuel();
        tesla.charge();
	}

}
