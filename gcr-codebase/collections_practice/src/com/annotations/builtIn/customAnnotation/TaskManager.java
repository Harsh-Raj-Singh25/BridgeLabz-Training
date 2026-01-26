package com.annotations.builtIn.customAnnotation;

pimport java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.*;

import com.sun.tools.javac.code.Attribute.RetentionPolicy;

//1. Define the Annotation
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
	int priority();
	String assignedTo();
}

//2. Apply the Annotation
class TaskManager {
	@TaskInfo(priority = 1, assignedTo = "Gemini")
	public void processTask() {
		System.out.println("Processing task...");
	}
}
