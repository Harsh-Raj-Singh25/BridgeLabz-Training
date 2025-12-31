package com.objectModeling.level1.UniversityManagement;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private Professor instructor; // Association with Professor
    private List<Student> students; // Association with Students

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Assigning a professor to the course
    public void assignProfessor(Professor professor) {
        this.instructor = professor;
    }

    public String getInstructorName() {
        return (instructor != null) ? instructor.getName() : "TBA";
    }

    // Adding a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }

    public void showClassRoster() {
        System.out.println("\nClass Roster for " + courseName);
        System.out.println("Instructor: " + getInstructorName());
        for (Student s : students) {
            System.out.println("  * " + s.getName());
        }
    }
}