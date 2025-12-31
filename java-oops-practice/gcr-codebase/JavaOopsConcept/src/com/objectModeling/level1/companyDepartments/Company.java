package com.objectModeling.level1.companyDepartments;

import java.util.ArrayList;
import java.util.List;


// Company is the Parent. When this object is destroyed,
// the Departments and Employees inside it are also marked for deletion.

public class Company {
    private String companyName;
    private List<Department> departments;
    // constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Composition: The Company creates the Department internally
    public void createDepartment(String deptName) {
        Department newDept = new Department(deptName);
        this.departments.add(newDept);
    }

    // Helper to get a department to add employees
    public Department getDepartment(int index) {
        return departments.get(index);
    }

    public void showStructure() {
        System.out.println("\n--- Company Structure: " + companyName + " ---");
        for (Department d : departments) {
            d.displayDeptInfo();
        }
    }
}