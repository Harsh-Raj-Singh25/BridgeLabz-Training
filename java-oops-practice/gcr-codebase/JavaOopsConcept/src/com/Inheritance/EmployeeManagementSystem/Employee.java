package com.Inheritance.EmployeeManagementSystem;

public class Employee {
	// attributes
	public String name;
	protected int id;
	private int salary;
	//constructor
	Employee(String name, int id, int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	// method
	void displayDetails() {
		System.out.println("The Employee Name: "+name+"\n ID: "+id+"\n Salaray :"+salary);
		
	}
	
}
