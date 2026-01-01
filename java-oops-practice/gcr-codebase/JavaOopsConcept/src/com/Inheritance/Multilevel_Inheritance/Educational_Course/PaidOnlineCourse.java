package com.Inheritance.Multilevel_Inheritance.Educational_Course;

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        // Passing data to the Level 2 constructor
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayFullInvoice() {
        displayOnlineDetails(); // Call parent method (which calls grandparent)
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Original Fee: Rs. " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Payable Amount: Rs. " + finalPrice);
        System.out.println("----------------------------------------------");
    }
}
