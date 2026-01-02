package com.Encapsulation_Polymorphism_Interface_AbstractClass.VehicleRentalSystem;

class Car extends Vehicle implements Insurable {
	private String policyNumber; // Sensitive detail so it's private

	public Car(String vNum, double rate, String policy) {
		super(vNum, "Car", rate);
		this.policyNumber = policy;
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	@Override
	public double calculateInsurance() {
		return getRentalRate() * 0.05;
	} // 5% of rate

	@Override
	public String getInsuranceDetails() {
		return "Policy: " + policyNumber;
	}
}