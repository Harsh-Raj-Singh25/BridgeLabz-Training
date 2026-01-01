package com.Inheritance.EmployeeManagementSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("Harsh",15,65000);
		Manager m1 = new Manager("Anjali", 101, 95000, 5);
        Developer d1 = new Developer("Sanya", 102, 80000, "Java");
        Intern i1 = new Intern("Rahul", 103, 25000, "Team-A");
		
		employee.displayDetails();
		m1.displayDetails();
		d1.displayDetails();
		i1.displayDetails();
	}

}
