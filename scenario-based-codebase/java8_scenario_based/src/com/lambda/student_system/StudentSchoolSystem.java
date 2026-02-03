package com.lambda.student_system;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StudentSchoolSystem {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
                new Student("Harsh", 17, 78, 1),
                new Student("Aditya", 19, 92, 3),
                new Student("Namrata", 16, 99, 89),
                new Student("Shashwat", 20, 42, 7),
                new Student("Anand", 18, 65, 34)
        );
//		Scenario 1: Student / School System
//		1.Use a lambda expression to print a welcome message for a student.
		Consumer< Student> welcome = name -> System.out.println("Welcome, " + name);
		students.forEach(welcome);
//		2.Use lambda to check if a student is pass or fail based on marks.
		Predicate<Integer> isPass= marks -> marks >= 45; 
		 students.forEach(s -> System.out.println(s.name + " ==> " + (isPass.test(s.marks) ? "Pass" : "Fail")));
//		3.Sort students by name using lambda.
		 students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
//		4.Sort students by rank using lambda.
		 students.sort((s1, s2) -> s1.getRank()-s2.getRank());
//		5.Use lambda to display students whose age is above 18.
		 students.stream().filter(s -> s.getAge() > 18).forEach(System.out::println);
	}
}
