package com.Inheritance.Multilevel_Inheritance.Educational_Course;

// intermediate subclass
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        // Passing data to the Level 1 constructor
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    // method for displaying
    void displayOnlineDetails() {
        displayCourseInfo(); // Call grandparent method
        System.out.println("Platform: " + platform + " | Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
