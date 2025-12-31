package com.objectModeling.level1.schoolAndStudents;

import java.util.ArrayList;
import java.util.List;


// Course Class
 //Relationship: Many-to-Many Association with Student.

public class Course {
    private String courseName;
    private List<Student> enrolledStudents;
    // constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Association: Linking a student to this course
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getStudentName());
        }
    }
}
