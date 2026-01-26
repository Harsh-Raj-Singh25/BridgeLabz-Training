package com.streams.serialization;

import java.io.Serializable;

//Must implement Serializable to be stored via ObjectOutputStream
class Employee implements Serializable {
	// serialVersionUID ensures compatibility during deserialization
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String department;
	private double salary;

	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("ID: %d | Name: %-10s | Dept: %-10s | Salary: Rs.%.2f", id, name, department, salary);
	}
}
