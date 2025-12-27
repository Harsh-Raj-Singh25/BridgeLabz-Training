package com.constructor.level1;

public class Course {
    String courseName;
    String duration;
    double fee;
    static String instituteName = "Bridgelabz";

    // Parameterized constructor
    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: ₹ " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", "3 Months", 15000.0);
        Course course2 = new Course("Web Development", "4 Months", 20000.0);

        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Update institute name
        Course.updateInstituteName("Tech Academy");
        System.out.println("updated Institute :");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
