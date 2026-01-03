package UniversityCourseEnrollmentSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Faculty
        Faculty prof = new Faculty("Dr. Vishal");

        // Create different types of students (Inheritance)
        Undergraduate ug = new Undergraduate("UG-2026", "Harsh Singh");
        Postgraduate pg = new Postgraduate("PG-2026", "Namrata Khapre", "AIML");

        System.out.println("==============================================");
        System.out.println("              TIT TECHNOCRATS                 ");
        System.out.println("==============================================");

        // Faculty assigns grades (Polymorphism)
        prof.evaluateStudent(ug, 92.0); // Uses UG grading logic
        prof.evaluateStudent(pg, 92.0); // Uses PG grading logic (will be lower due to difficulty)

        System.out.println("\n--- Final Transcripts ---");
        System.out.println("----------------------------------------------");
        ug.displayTranscript();
        System.out.println("----------------------------------------------");
        pg.displayTranscript();
        System.out.println("==============================================");
    }
}


