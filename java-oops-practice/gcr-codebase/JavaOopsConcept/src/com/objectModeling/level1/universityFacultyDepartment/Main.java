package com.objectModeling.level1.universityFacultyDepartment;

public class Main {
    public static void main(String[] args) {
    	// creating two new faculties
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Kaushal");
        // creating an university object
        University uni = new University("TIT");
        
        // adding the departments
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");
        
        // adding the faculties
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDetails();

        // If University object is deleted,
        // Departments are also destroyed (Composition)
        // Faculty objects still exist (Aggregation)
        
    }
}