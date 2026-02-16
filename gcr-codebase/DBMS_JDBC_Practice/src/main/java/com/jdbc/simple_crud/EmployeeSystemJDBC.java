package com.jdbc.simple_crud;

import java.sql.*;
import java.util.Scanner;

public class EmployeeSystemJDBC {
	// Database Configuration
	private static final String URL = "jdbc:mysql://localhost:3306/Employee_System";
	private static final String USER = "root";
	private static final String PASS = "Harsh@SQL12"; 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Employee Management System ---");
			System.out.println("1. Add Employee");
			System.out.println("2. View All Employees");
			System.out.println("3. Update Salary (by Name)");
			System.out.println("4. Delete Employee (by Name)");
			System.out.println("5. Search Employee by Name");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1 -> addEmployee(scanner);
			case 2 -> viewAll();
			case 3 -> updateSalary(scanner);
			case 4 -> deleteEmployee(scanner);
			case 5 -> searchByName(scanner);
			case 6 -> {
				System.out.println("Exiting System...");
				return;
			}
			default -> System.out.println("Invalid selection!");
			}
		}
	}

	// --- CRUD OPERATIONS ---

	private static void addEmployee(Scanner sc) {
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		System.out.print("Department: ");
		String dept = sc.nextLine();

		String sql = "INSERT INTO employee (name, salary, department) VALUES (?, ?, ?)";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, name);
			pstmt.setDouble(2, salary);
			pstmt.setString(3, dept);
			pstmt.executeUpdate();
			System.out.println("Query OK, 1 row affected.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void viewAll() {
		String sql = "SELECT * FROM employee";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			System.out.println("\n+---------+----------+------------+");
			System.out.println("| Name    | Salary   | Department |");
			System.out.println("+---------+----------+------------+");
			while (rs.next()) {
				System.out.printf("| %-7s | %-8.2f | %-10s |\n", rs.getString("name"), rs.getDouble("salary"),
						rs.getString("department"));
			}
			System.out.println("+---------+----------+------------+");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void updateSalary(Scanner sc) {
		System.out.print("Enter name to update salary: ");
		String name = sc.nextLine();
		System.out.print("Enter new salary: ");
		double salary = sc.nextDouble();

		String sql = "UPDATE employee SET salary = ? WHERE name = ?";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setDouble(1, salary);
			pstmt.setString(2, name);
			int affected = pstmt.executeUpdate();
			System.out.println("Query OK, " + affected + " row(s) affected.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void deleteEmployee(Scanner sc) {
		System.out.print("Enter name to delete: ");
		String name = sc.nextLine();

		String sql = "DELETE FROM employee WHERE name = ?";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, name);
			int affected = pstmt.executeUpdate();
			System.out.println("Query OK, " + affected + " row(s) affected.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void searchByName(Scanner sc) {
		System.out.print("Enter name to search: ");
		String name = sc.nextLine();

		String sql = "SELECT * FROM employee WHERE name = ?";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.printf("Found: %s | %.2f | %s\n", rs.getString("name"), rs.getDouble("salary"),
						rs.getString("department"));
			} else {
				System.out.println("No employee found with that name.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}