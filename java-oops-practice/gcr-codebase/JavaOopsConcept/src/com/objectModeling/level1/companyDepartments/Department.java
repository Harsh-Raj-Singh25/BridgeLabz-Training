package com.objectModeling.level1.companyDepartments;

import java.util.ArrayList;
import java.util.List;

//  Department represents a unit within the company.
// It contains Employees.
public class Department {
    private String deptName;
    private List<Employee> employees;
    // constructor
    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }
    // Composition: The Department adds employees to its own internal list
    public void addEmployee(String name, String role) {
        this.employees.add(new Employee(name, role));
    }
    // method that displays department issues
    public void displayDeptInfo() {
        System.out.println("  Department: " + deptName);
        for (Employee e : employees) {
            e.showDetails();
        }
    }
}