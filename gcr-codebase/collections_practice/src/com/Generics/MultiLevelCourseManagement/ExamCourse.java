package com.Generics.MultiLevelCourseManagement;

class ExamCourse extends CourseType {
	ExamCourse() {
		super("Written Exam");
	}

	void conductEvaluation() {
		System.out.println(" Distributing question papers for the final exam.");
	}
}