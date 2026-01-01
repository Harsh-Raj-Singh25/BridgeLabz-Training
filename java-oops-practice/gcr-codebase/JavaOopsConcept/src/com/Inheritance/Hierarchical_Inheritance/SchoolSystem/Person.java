package com.Inheritance.Hierarchical_Inheritance.SchoolSystem;

//Superclass
class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayCommonInfo() {
		System.out.print("Name: " + name + " | Age: " + age);
	}
}
