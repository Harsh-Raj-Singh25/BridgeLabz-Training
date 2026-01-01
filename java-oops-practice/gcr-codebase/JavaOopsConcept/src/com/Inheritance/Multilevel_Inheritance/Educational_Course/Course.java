package com.Inheritance.Multilevel_Inheritance.Educational_Course;

class Course {
    String courseName;
    int duration; // in hours
    // base constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseInfo() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + " hrs");
    }
}
