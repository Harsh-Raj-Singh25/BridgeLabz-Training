package com.collections.map_Interface;

import java.util.*;

class Employee {
	String name;
	String department;

	Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class GroupingTask {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", "HR"), new Employee("Bob", "IT"),
				new Employee("Carol", "HR"));

		Map<String, List<Employee>> departmentMap = new HashMap<>();

		for (Employee emp : employees) {
			// If the department key doesn't exist, create an empty ArrayList
			// Then add the current employee to that list
			departmentMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
		}

		System.out.println("Grouped by Department:");
		departmentMap.forEach((dept, list) -> System.out.println(dept + ": " + list));
	}
}