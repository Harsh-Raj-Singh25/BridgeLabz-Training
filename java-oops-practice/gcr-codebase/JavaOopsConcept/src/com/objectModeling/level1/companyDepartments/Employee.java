package com.objectModeling.level1.companyDepartments;

// Employee represents the individual working in a department.
 
public class Employee {
    private String name;
    private String role;
    
    // constructor
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
    // method to show details of employee
    public void showDetails() {
        System.out.println("      - " + name + " (" + role + ")");
    }
}