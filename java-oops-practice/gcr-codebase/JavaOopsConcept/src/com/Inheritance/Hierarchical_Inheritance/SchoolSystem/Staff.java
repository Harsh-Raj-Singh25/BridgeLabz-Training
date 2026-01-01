package com.Inheritance.Hierarchical_Inheritance.SchoolSystem;

//Subclass 3
class Staff extends Person {
	String department;
	// constructor 
	Staff(String name, int age, String dept) {
		// using super to initialize super class constructor elements
		super(name, age);
		this.department = dept;
	}

	void displayRole() {
		displayCommonInfo();
		System.out.println(" | Role: Staff | Dept: " + department);
	}
}