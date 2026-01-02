package com.Encapsulation_Polymorphism_Interface_AbstractClass.HospitalPatientManagement;

//ABSTRACT CLASS: Defines general patient attributes
abstract class Patient {
	// ENCAPSULATION: Private fields to secure sensitive data
	private String patientId;
	private String name;
	private java.util.List<String> records = new java.util.ArrayList<>();

	public Patient(String patientId, String name) {
		this.patientId = patientId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	protected void saveRecord(String note) {
		records.add(note);
	}

	protected java.util.List<String> getRecords() {
		return records;
	}

	// ABSTRACT METHOD: Defined differently for In-Patient vs Out-Patient
	public abstract double calculateBill();

	public void getPatientDetails() {
		System.out.println("Patient ID: " + patientId + " | Name: " + name);
	}
}
