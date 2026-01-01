package com.Inheritance.Multilevel_Inheritance.Educational_Course;

public class Main {
	public static void main(String[] args) {
        // Creating the most specialized object
        PaidOnlineCourse myCourse = new PaidOnlineCourse(
            "Java Training", 
            600, 
            "BridgeLabz", 
            true, 
            3000.0, 
            10.0
        );

        System.out.println("--- Enrollment Details ---");
        myCourse.displayFullInvoice();
    }
}
