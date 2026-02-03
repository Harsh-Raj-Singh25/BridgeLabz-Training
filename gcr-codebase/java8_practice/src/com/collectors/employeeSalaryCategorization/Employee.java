package com.collectors.employeeSalaryCategorization;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	String name;
	String department;
	double salary;

	Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}
}
