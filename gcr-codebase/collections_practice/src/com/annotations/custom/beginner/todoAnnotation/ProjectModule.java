package com.annotations.custom.beginner.todoAnnotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

//  Define the @Todo Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
	String task();

	String assignedTo();

	String priority() default "MEDIUM";
}

// Class with pending features
class ProjectModule {
	@Todo(task = "Implement login encryption", assignedTo = "Harsh", priority = "HIGH")
	public void securityModule() {
	}

	@Todo(task = "Add dark mode support", assignedTo = "Namrata")
	public void uiModule() {
	}

	public void existingFeature() {
		System.out.println("This is already done.");
	}
}
