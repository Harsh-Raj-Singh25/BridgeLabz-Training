package com.Generics.MultiLevelCourseManagement;

class Course<T extends CourseType> {
	private String courseName;
	private String courseCode;
	private T evaluationType;

	public Course(String name, String code, T type) {
		this.courseName = name;
		this.courseCode = code;
		this.evaluationType = type;
	}

	public T getEvaluationType() {
		return evaluationType;
	}

	public void startAssessment() {
		System.out.println("\nStarting Assessment for: " + courseName + " [" + courseCode + "]");
		evaluationType.conductEvaluation();
	}
}
