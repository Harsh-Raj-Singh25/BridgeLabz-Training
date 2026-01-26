package com.streams.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerializer {
	private static final String FILE_NAME = "employees.dat";

	public static void main(String[] args) {
		// Create a list of employees
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Sarthak", "IT", 75000));
		employeeList.add(new Employee(102, "Anjali", "HR", 60000));
		employeeList.add(new Employee(103, "Devika", "Finance", 80000));

		//  Serialize: Save the List to a file
		serializeEmployees(employeeList);

		// Deserialize: Retrieve the List from the file
		List<Employee> retrievedList = deserializeEmployees();

		//  Display the results
		if (retrievedList != null) {
			System.out.println("\n Successfully retrieved employees from file:");
			retrievedList.forEach(System.out::println);
		}
	}

	private static void serializeEmployees(List<Employee> employees) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			oos.writeObject(employees);
			System.out.println(" List serialized to " + FILE_NAME);
		} catch (IOException e) {
			System.err.println(" Error during serialization: " + e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	private static List<Employee> deserializeEmployees() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
			return (List<Employee>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(" Error during deserialization: " + e.getMessage());
			return null;
		}
	}
}
