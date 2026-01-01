package com.Inheritance.EmployeeManagementSystem;

public class Developer extends Employee {
	String programmingLanguage;
	
	Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
	
	@Override
	void displayDetails() {
		System.out.println("The developer's programming Language is : "+ programmingLanguage);
	}
}
