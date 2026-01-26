package com.reflection.advance_level.methodExecutionTiming;

import java.lang.reflect.Method;

public class Profiler {

	// The core logic to profile any object
	public static void profile(Object obj) throws Exception {
		System.out.println("--- Starting Performance Profile for " + obj.getClass().getSimpleName() + " ---");

		Method[] methods = obj.getClass().getDeclaredMethods();

		for (Method m : methods) {
			// Ensure we can call the method
			m.setAccessible(true);

			// Record start time in nanoseconds
			long start = System.nanoTime();

			// Invoke the method
			m.invoke(obj);

			// Record end time
			long end = System.nanoTime();

			// Calculate duration in milliseconds
			double duration = (end - start) / 1_000_000.0;
			System.out.println(" Method [" + m.getName() + "] took: " + duration + " ms");
			System.out.println("------------------------------------------------");
		}
	}

	public static void main(String[] args) {
		try {
			TaskRunner runner = new TaskRunner();

			// Pass the object to the profiler
			profile(runner);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}