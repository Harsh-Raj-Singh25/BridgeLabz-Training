package com.objectModeling.level1.schoolAndStudents;

import java.util.ArrayList;
import java.util.List;


// School Class
// Relationship: Aggregates Student objects.

public class School {
    private String schoolName;
    private List<Student> students;
    // constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Aggregation: The student is passed in from outside
    public void admitStudent(Student student) {
        students.add(student);
    }
    // displaying all the students enrolled
    public void displayAllStudents() {
        System.out.println("\n--- Students at " + schoolName + " ---");
        for (Student s : students) {
            System.out.println("Student: " + s.getStudentName());
        }
    }
}