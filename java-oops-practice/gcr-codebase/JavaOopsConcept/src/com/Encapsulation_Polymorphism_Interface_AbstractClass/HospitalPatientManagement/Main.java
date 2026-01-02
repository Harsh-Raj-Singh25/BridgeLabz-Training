package com.Encapsulation_Polymorphism_Interface_AbstractClass.HospitalPatientManagement;

public class Main {
	public static void main(String[] args) {
		// POLYMORPHISM: Handling various types of patient dynamically
		java.util.List<Patient> hospitalList = new java.util.ArrayList<>();
		hospitalList.add(new InPatient("P001", "Utkarsh", 4));
		hospitalList.add(new OutPatient("P002", "Rahul Kumar"));

		for (Patient p : hospitalList) {
			p.getPatientDetails();
			System.out.println("Total Bill: Rs. " + p.calculateBill());

			// Check for INTERFACE implementation to handle medical records
			if (p instanceof MedicalRecord) {
				MedicalRecord m = (MedicalRecord) p;
				m.addRecord("Temperature 98.6F");
				m.viewRecords();
			}
			System.out.println("-------------------------");
		}
	}
}