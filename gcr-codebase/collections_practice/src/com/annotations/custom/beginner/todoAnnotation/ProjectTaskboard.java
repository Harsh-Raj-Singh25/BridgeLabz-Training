package com.annotations.custom.beginner.todoAnnotation;

import java.lang.reflect.Method;

//Reflection class to print the "Task Board"
public class ProjectTaskboard {
public static void main(String[] args) {
	Method[] methods = ProjectModule.class.getDeclaredMethods();

	System.out.println(" PENDING TASKS FROM SOURCE CODE:");
	System.out.println("----------------------------------");

	for (Method m : methods) {
		if (m.isAnnotationPresent(Todo.class)) {
			Todo todo = m.getAnnotation(Todo.class);
			System.out.println("   Task: " + todo.task());
			System.out.println("   Developer: " + todo.assignedTo());
			System.out.println("   Priority:  " + todo.priority());
			System.out.println();
		}
	}
}
}
