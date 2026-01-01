package com.objectModeling.DesignModeling.SchoolResultsApplication;

import java.util.ArrayList;
import java.util.List;

// The Subject Class
class Subject {
    String subjectName;
    int marks;

    Subject(String name, int marks) {
        this.subjectName = name;
        this.marks = marks;
    }
}

// The Student Class (Aggregation)
class Student {
    String name;
    List<Subject> subjects;

    Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    void addSubject(Subject s) {
        subjects.add(s);
    }
}

//The GradeCalculator (Logic/Service Class)
class GradeCalculator {
    public static String calculateGrade(Student s) {
        int total = 0;
        for (Subject sub : s.subjects) {
            total += sub.marks;
        }
        double average = (double) total / s.subjects.size();

        if (average >= 90) return "A+";
        if (average >= 75) return "A";
        return "B";
    }
}

//  Driver Class
public class SchoolResultsApp {
    public static void main(String[] args) {
        // Creating the objects (Object Diagram Snapshot)
        Student john = new Student("John");
        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science", 85));

        // Interaction (Sequence Diagram Logic)
        String finalGrade = GradeCalculator.calculateGrade(john);

        System.out.println("Result for " + john.name + ": " + finalGrade);
    }
}