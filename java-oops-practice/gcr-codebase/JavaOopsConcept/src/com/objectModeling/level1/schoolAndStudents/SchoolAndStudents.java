package com.objectModeling.level1.schoolAndStudents;

public class SchoolAndStudents {
    public static void main(String[] args) {
        // Create a School
        School mySchool = new School("Holy Mission High School");

        // Create independent Student objects
        Student s1 = new Student("Harsh");
        Student s2 = new Student("Natasha");

        //  School admits students (Aggregation)
        mySchool.admitStudent(s1);
        mySchool.admitStudent(s2);

        //  Create independent Course objects
        Course math = new Course("Maths Master");
        Course physics= new Course("Physics Master");

       // Many-to-Many Association (Enrollment)
        s1.enrollInCourse(math);
        s1.enrollInCourse(physics); // Harsh takes two courses
        s2.enrollInCourse(physics); // Natasha takes one course

        //Verify Communication
        System.out.println("--- Student Perspective ---");
        s1.viewMyCourses();
        
        System.out.println("\n--- Course Perspective ---");
        math.showEnrolledStudents();

        mySchool.displayAllStudents();
    }
}
