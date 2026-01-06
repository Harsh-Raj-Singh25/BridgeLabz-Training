package CampusConnect;

public class Main {
    public static void main(String[] args) {
        //Initialize Faculty
        Faculty profHarsh = new Faculty("Harsh Singh", "harsh.s@university.edu", "F001", "Computer Science");

        //Initialize Student
        Student studentNamrata = new Student("NamrataKhapre", "namrata@student.edu", "S101");
        
        // Encapsulation: Adding Grades securely
        studentNamrata.addGrade(88.0);
        studentNamrata.addGrade(95.0);
        studentNamrata.addGrade(91.0);

        //Initialize Course
        Course javaCourse = new Course("CS102", "Advanced Java", profHarsh);
        
        System.out.println("         CAMPUS CONNECT ACADEMIC PORTAL      ");
        System.out.println("==============================================");

        // Interface Usage: Enrollment
        studentNamrata.enrollCourse(javaCourse);

        // Polymorphism: Different print details for different people
        System.out.println("\n--- User Profiles ---");
        profHarsh.printDetails();
        System.out.println();
        studentNamrata.printDetails();

        // Course Summary
        javaCourse.displayCourseSummary();
        System.out.println("==============================================");
    }
}
