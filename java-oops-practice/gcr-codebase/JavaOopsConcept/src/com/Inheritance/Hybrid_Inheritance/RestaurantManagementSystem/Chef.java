package com.Inheritance.Hybrid_Inheritance.RestaurantManagementSystem;

//Subclass inheriting Person and implementing Worker
class Chef extends Person implements Worker {
	String specialty;

	Chef(String name, int id, String specialty) {
		super(name, id);
		this.specialty = specialty;
	}

	@Override
	public void performDuties() {
		displayIdentity();
		System.out.println(" | Role: Chef | Duty: Preparing " + specialty);
	}
}