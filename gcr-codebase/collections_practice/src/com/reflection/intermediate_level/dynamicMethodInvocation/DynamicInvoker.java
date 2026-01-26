package com.reflection.intermediate_level.dynamicMethodInvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicInvoker {
	public static void main(String[] args) throws Exception {
		MathOperations math = new MathOperations();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter method name (add/subtract/multiply): ");
		String methodName = sc.nextLine().toLowerCase();

		// Parameters: (Method Name, Parameter Types)
		try {
			Method method = MathOperations.class.getMethod(methodName, int.class, int.class);

			// Invoke: (Object Instance, Arguments)
			method.invoke(math, 20, 10);
		} catch (NoSuchMethodException e) {
			System.out.println(" Method not found: " + methodName);
		}
	}
}
