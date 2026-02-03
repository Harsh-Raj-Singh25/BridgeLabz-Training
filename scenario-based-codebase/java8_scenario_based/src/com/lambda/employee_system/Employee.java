package com.lambda.employee_system;

class Employee {
	String name;
	double salary;
	int experience;

	Employee(String name, double salary, int experience) {
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return name + " [Salary: " + salary + ", Exp: " + experience + " yrs]";
	}
}
