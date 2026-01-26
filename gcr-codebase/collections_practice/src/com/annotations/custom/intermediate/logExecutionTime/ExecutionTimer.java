package com.annotations.custom.intermediate.logExecutionTime;

import java.lang.reflect.Method;

public class ExecutionTimer {
	public static void main(String[] args) throws Exception {
		PerformanceService service = new PerformanceService();
		Method[] methods = service.getClass().getDeclaredMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(LogExecutionTime.class)) {
				long start = System.nanoTime();

				method.invoke(service); // Execute the method

				long end = System.nanoTime();
				long duration = (end - start) / 1_000_000; // Convert to milliseconds
				System.out.println(" Execution Time for " + method.getName() + ": " + duration + "ms\n");
			}
		}
	}
}
