package com.objectModeling.level1.schoolAndStudents;

import java.util.ArrayList;
import java.util.List;


//Student Class
// Relationship: Aggregation with School, Association with Course.

public class Student {
    private String studentName;
    private List<Course> enrolledCourses;
    // constructor
    public Student(String studentName) {
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
    }
    // method to return name
    public String getStudentName() {
        return studentName;
    }
     // Many-to-Many Communication: 
     // We add the course to the student's list AND 
     //add the student to the course's list.
     //
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this); 
    }
    // method to view courses
    public void viewMyCourses() {
        System.out.println(studentName + " is enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}