package SkillForge;

public class SkillForgeMain {
    public static void main(String[] args) {
        //  Setup Users
        Instructor profHarsh = new Instructor("Harsh Singh", "INST-001");
        Student studentNamrata = new Student("Namrata Khapre", "STU-505");

        //  Setup Courses
        Course javaExpert = new Course("Mastering Java OOPS", "Expert");
        Course webBeginner = new Course("HTML/CSS Basics", "Beginner");

        System.out.println("==============================================");
        System.out.println("        WELCOME TO SKILLFORGE PORTAL       ");
        System.out.println("==============================================");

        //  Encapsulation: Adding reviews securely
        javaExpert.addReview(5);
        javaExpert.addReview(4);
        
        System.out.println("Course: " + javaExpert.getRating() + " stars");

        //  Polymorphism: Different certificate formats
        javaExpert.generateCertificate(studentNamrata.getName());
        webBeginner.generateCertificate(studentNamrata.getName());

        System.out.println("==============================================");
    }
}
