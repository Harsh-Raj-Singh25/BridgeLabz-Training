package com.employeeManagement;

import java.time.LocalDate;

public class Employee {
	String id;
	String name;
	int age;
	String gender;
	String department;
	LocalDate joiningdate;
	int salary;
	
	public Employee(String id, String name, int age, String gender, String department, LocalDate date, int salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.department=department;
		this.joiningdate=date;
		this.salary=salary;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public LocalDate getJoiningDate() {
		return joiningdate;
	}

	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
	    return "Employee [ID=" + id + ", Name=" + name + ", Gender=" + gender + ", Salary=" + salary + "]";
	}
	
	
	
	
	
}