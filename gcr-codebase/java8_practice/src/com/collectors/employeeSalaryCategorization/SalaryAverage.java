package com.collectors.employeeSalaryCategorization;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
 * Employee Salary Categorization
You have a list of employees with their departments and salaries. Use
Collectors.groupingBy() to group employees by department and calculate the
average salary for each department.

Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
 */
public class SalaryAverage {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Harsh", "Management", 1170000), 
				new Employee("Amit", "HR", 50000),
				new Employee("Namrata", "IT", 90000), 
				new Employee("Rahul", "HR", 55000)
		);
		
		Map<String, Double> map=employees.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.averagingDouble(Employee:: getSalary)));
//		System.out.println(map);
		map.forEach((depart,amount) -> System.out.println(depart +" salary total = "+ amount));
		System.out.println(" Using for each direct ");
		
		employees.stream(). // streaming
		collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.averagingDouble(Employee:: getSalary))). // collecting and averaging
		forEach((depart,amount) -> System.out.println(depart +" salary total = "+ amount));; // printing
		
		
	}
	
}
