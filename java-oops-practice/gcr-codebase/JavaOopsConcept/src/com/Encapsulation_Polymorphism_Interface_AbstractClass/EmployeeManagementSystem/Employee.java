package com.Encapsulation_Polymorphism_Interface_AbstractClass.EmployeeManagementSystem;

abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String departmentName;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters and Setters
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    // Abstract method: To be implemented by subclasses
    public abstract double calculateSalary();

    // Concrete method: Common for all employees
    public void displayDetails() {
        System.out.printf("ID: %d | Name: %-10s | Dept: %-10s | Final Salary: Rs. %.2f%n", 
            employeeId, name, departmentName, calculateSalary());
    }

    // Implementation of Interface methods
    @Override
    public void assignDepartment(String deptName) {
        this.departmentName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return departmentName;
    }
}