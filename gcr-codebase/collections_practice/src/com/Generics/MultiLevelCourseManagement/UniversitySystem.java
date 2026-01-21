package com.Generics.MultiLevelCourseManagement;

import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {

	// Wildcard method: Accepts a list of courses with ANY CourseType subtype
	public static void processTermEnd(List<Course<? extends CourseType>> courses) {
		System.out.println("---  University Term-End Processing ---");
		for (Course<? extends CourseType> course : courses) {
			course.startAssessment();
		}
	}

	public static void main(String[] args) {
		// Create specific courses
		Course<ExamCourse> math = new Course<>("Mathematics II", "MTH201", new ExamCourse());
		Course<ResearchCourse> phd = new Course<>("Quantum Physics", "PHY900", new ResearchCourse());

		// Put different generic types into one master list using Wildcards
		List<Course<? extends CourseType>> semesterCourses = new ArrayList<>();
		semesterCourses.add(math);
		semesterCourses.add(phd);

		// Process the entire semester at once
		processTermEnd(semesterCourses);
	}
}