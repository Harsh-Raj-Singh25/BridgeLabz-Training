package com.Encapsulation_Polymorphism_Interface_AbstractClass.HospitalPatientManagement;

class InPatient extends Patient implements MedicalRecord {
	private int days;
	private double dailyCharge = 1500;

	public InPatient(String id, String name, int days) {
		super(id, name);
		this.days = days;
	}

	@Override
	public double calculateBill() {
		return days * dailyCharge; // LOGIC: Billing based on stay duration
	}

	@Override
	public void addRecord(String entry) {
		saveRecord("Clinical Note: " + entry);
	}

	@Override
	public void viewRecords() {
		System.out.println("Medical History: " + getRecords());
	}
}