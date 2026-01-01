package com.Inheritance.Hierarchical_Inheritance.SchoolSystem;

//Subclass 1
class Teacher extends Person {
	String subject;

	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	void displayRole() {
		displayCommonInfo();
		System.out.println(" | Role: Teacher | Subject: " + subject);
	}
}
