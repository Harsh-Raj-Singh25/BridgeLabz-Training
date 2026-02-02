package com.collectors.studentGrouping;

import java.util.*;
import java.util.stream.Collectors;

public class StudentResultGrouping {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Alice", "A"), new Student("Bob", "B"),
				new Student("Charlie", "A"), new Student("David", "C"));

		Map<String, List<String>> namesByGrade = students.stream().collect(
				Collectors.groupingBy(Student::getGrade, Collectors.mapping(Student::getName, Collectors.toList())));

		System.out.println("Students by Grade: " + namesByGrade);
	}
}
