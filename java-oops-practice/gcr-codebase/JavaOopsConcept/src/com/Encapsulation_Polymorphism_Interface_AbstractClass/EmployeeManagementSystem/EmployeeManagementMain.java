package com.Encapsulation_Polymorphism_Interface_AbstractClass.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementMain {
    public static void main(String[] args) {
        // Polymorphism: List of type Employee holding different subclasses
        List<Employee> staff = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Harsh", 60000, 5000);
        Employee e2 = new PartTimeEmployee(102, "Namrata", 80, 500);

        // Assign Departments
        e1.assignDepartment("IT");
        e2.assignDepartment("Design");

        staff.add(e1);
        staff.add(e2);

        System.out.println("--- Employee Payroll Report ---");
        for (Employee emp : staff) {
            emp.displayDetails(); // Dynamic Method Dispatch
        }
    }
}