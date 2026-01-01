package com.Inheritance.Hierarchical_Inheritance.SchoolSystem;

//Subclass 2
class Student extends Person {
	String grade;

	Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	void displayRole() {
		displayCommonInfo();
		System.out.println(" | Role: Student | Grade: " + grade);
	}
}
