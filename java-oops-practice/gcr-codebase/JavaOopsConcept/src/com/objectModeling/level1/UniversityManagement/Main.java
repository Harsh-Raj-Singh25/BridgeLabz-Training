package com.objectModeling.level1.UniversityManagement;

public class Main {
    public static void main(String[] args) {
        // Create independent objects
        Professor profSmith = new Professor("Dr. Smith", "Computer Science");
        Student student1 = new Student("Harsh");
        Student student2 = new Student("Namrata");
        Course javaCourse = new Course("Advanced Java");

        //  Communication - Professor is assigned to a course
        profSmith.teachCourse(javaCourse);

        //  Communication - Students enroll in the course
        student1.enrollInCourse(javaCourse);
        student2.enrollInCourse(javaCourse);

        //Verification of relationships
        javaCourse.showClassRoster();
        student1.showMySchedule();

        // Direct Communication
        profSmith.announce("Please submit your assignments by Friday.");
    }
}