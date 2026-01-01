package com.Inheritance.Hybrid_Inheritance.RestaurantManagementSystem;

//Subclass inheriting Person and implementing Worker
class Waiter extends Person implements Worker {
	int tablesAssigned;

	Waiter(String name, int id, int tables) {
		super(name, id);
		this.tablesAssigned = tables;
	}

	@Override
	public void performDuties() {
		displayIdentity();
		System.out.println(" | Role: Waiter | Duty: Serving " + tablesAssigned + " tables");
	}
}
