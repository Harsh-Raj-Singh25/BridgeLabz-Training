package com.Inheritance.Hybrid_Inheritance.RestaurantManagementSystem;

//Superclass
class Person {
	String name;
	int id;

	Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	void displayIdentity() {
		System.out.print("ID: " + id + " | Name: " + name);
	}
}