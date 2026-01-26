package com.annotations.custom.beginner.importantMethod;

import java.lang.reflect.Method;

//Main class to retrieve details
public class ImportanceChecker {
	public static void main(String[] args) {
		Class<BusinessLogic> obj = BusinessLogic.class;

		System.out.println("--- Important Methods Summary ---");
		for (Method method : obj.getDeclaredMethods()) {
			if (method.isAnnotationPresent(ImportantMethod.class)) {
				ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
				System.out.println("Method: " + method.getName() + " | Priority: " + annotation.level());
			}
		}
	}
}