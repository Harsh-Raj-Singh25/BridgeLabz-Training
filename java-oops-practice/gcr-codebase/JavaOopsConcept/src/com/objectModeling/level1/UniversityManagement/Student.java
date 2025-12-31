package com.objectModeling.level1.UniversityManagement;

import java.util.ArrayList;
import java.util.List;
// Student Class
//Relationship: Aggregation with University, Association with Course.
public class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    /**
     * Communication: Student initiates enrollment in a course.
     */
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this); // Tell the course to add this student
        System.out.println("Student " + name + " successfully enrolled in " + course.getCourseName());
    }

    public void showMySchedule() {
        System.out.println("\nSchedule for " + name + ":");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName() + " (Taught by: " 
                               + c.getInstructorName() + ")");
        }
    }
}
