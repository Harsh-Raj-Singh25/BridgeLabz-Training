package com.lambda.employee_system;

import java.util.*;
import java.util.function.*;

public class OfficeSystem {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("Harsh", 75000, 5),
				new Employee("Anjali", 25000, 2), new Employee("Vikram", 45000, 4), new Employee("Neha", 28000, 1)));

		// 1. Calculate Bonus (10% if salary > 30,000)
		// Concept: Function<T, R> takes T and returns R
		Function<Employee, Double> bonusCalc = e -> e.salary > 30000 ? e.salary * 0.10 : 0;
		System.out.println("--- 1. Employee Bonuses ---");
		employees.forEach(e -> System.out.println(e.name + " Bonus: " + bonusCalc.apply(e)));

		// 2. Sort employees by salary using lambda
		// Concept: Comparator is a functional interface for sorting
		employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
		System.out.println("\n--- 2. Sorted by Salary (Ascending) ---");
		employees.forEach(System.out::println);

		// 3. Check promotion eligibility (experience > 3 years)
		// Concept: Predicate<T> returns a boolean
		Predicate<Employee> isEligible = e -> e.experience > 3;
		System.out.println("\n--- 3. Promotion Eligibility ---");
		employees.forEach(e -> System.out.println(e.name + " Eligible: " + isEligible.test(e)));

		// 4. Print employee details
		// Concept: Consumer<T> performs an action and returns nothing
		Consumer<Employee> printer = e -> System.out.println("DATA: " + e.name.toUpperCase() + " | $" + e.salary);
		System.out.println("\n--- 4. Formatted Details ---");
		employees.forEach(printer);

		// 5. Compare two employees’ salaries
		// Concept: BiFunction<T, U, R> takes two inputs and returns a result
		BiFunction<Employee, Employee, String> comparator = (e1, e2) -> e1.salary > e2.salary ? e1.name + " earns more"
				: e2.name + " earns more";

		System.out.println("\n--- 5. Comparing Salaries (Harsh vs Anjali) ---");
		System.out.println(comparator.apply(employees.get(3), employees.get(0))); // Based on sorted list
	}
}