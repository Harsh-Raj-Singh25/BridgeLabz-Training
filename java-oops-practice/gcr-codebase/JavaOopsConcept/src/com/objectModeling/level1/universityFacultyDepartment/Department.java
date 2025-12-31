package com.objectModeling.level1.universityFacultyDepartment;

class Department {
    private String deptName;
    // constructor
    public Department(String deptName) {
        this.deptName = deptName;
    }
    // method to get the department name
    public String getDeptName() {
        return deptName;
    }
}