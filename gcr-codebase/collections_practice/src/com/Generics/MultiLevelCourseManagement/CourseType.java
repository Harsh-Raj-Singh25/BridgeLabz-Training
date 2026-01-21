package com.Generics.MultiLevelCourseManagement;

abstract class CourseType {
	String evaluationMethod;

	CourseType(String method) {
		this.evaluationMethod = method;
	}

	abstract void conductEvaluation();
}
