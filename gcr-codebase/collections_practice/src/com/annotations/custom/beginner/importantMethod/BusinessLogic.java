package com.annotations.custom.beginner.importantMethod;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define the Annotation
@Retention(RetentionPolicy.RUNTIME) // Must be RUNTIME to use Reflection
@Target(ElementType.METHOD) // Can only be used on methods
@interface ImportantMethod {
	String level() default "HIGH";
}

//  Class using the Annotation
class BusinessLogic {
	@ImportantMethod(level = "CRITICAL")
	public void processPayment() {
		System.out.println("Processing Payment...");
	}

	@ImportantMethod // Uses default level: "HIGH"
	public void generateReport() {
		System.out.println("Generating Report...");
	}

	public void sayHello() {
		System.out.println("Hello!");
	}
}
