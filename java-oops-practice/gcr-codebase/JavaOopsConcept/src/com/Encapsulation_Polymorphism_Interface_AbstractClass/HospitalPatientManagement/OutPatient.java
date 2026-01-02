package com.Encapsulation_Polymorphism_Interface_AbstractClass.HospitalPatientManagement;

class OutPatient extends Patient {
	public OutPatient(String id, String name) {
		super(id, name);
	}

	@Override
	public double calculateBill() {
		return 500.0;
	} // LOGIC: Flat consultation fee
}