package com.Inheritance.EmployeeManagementSystem;

public class Intern extends Employee {
	String teamName;
	
	Intern(String name, int id, int salary, String teamName) {
        super(name, id, salary);
        this.teamName = teamName;
    }
	
	@Override
	void displayDetails() {
		System.out.println("The intern is part of team : "+ teamName);
	}
}
