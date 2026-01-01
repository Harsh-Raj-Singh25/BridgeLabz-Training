package com.Inheritance.EmployeeManagementSystem;

public class Manager extends Employee {
	public int teamSize;
	
	Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary); 
        this.teamSize = teamSize;
    }
	
	@Override
	void displayDetails() {
		System.out.println("The manager's team size is : "+ teamSize);
		System.out.println("Name:"+name);
		
	}
	
	
}
