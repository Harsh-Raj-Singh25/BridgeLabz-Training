package com.Generics.MultiLevelCourseManagement;

class ResearchCourse extends CourseType {
	ResearchCourse() {
		super("Thesis Submission");
	}

	void conductEvaluation() {
		System.out.println(" Reviewing the 10,000-word research thesis.");
	}
}
