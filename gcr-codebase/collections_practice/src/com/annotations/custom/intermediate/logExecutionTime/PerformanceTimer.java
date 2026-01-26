package com.annotations.custom.intermediate.logExecutionTime;

import java.lang.annotation.*;
import java.lang.reflect.Method;

//   Define the Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

class PerformanceService {
	@LogExecutionTime
	public void slowTask() throws InterruptedException {
		Thread.sleep(500); // Simulating a delay
		System.out.println("Slow task finished.");
	}

	@LogExecutionTime
	public void fastTask() {
		System.out.println("Fast task finished.");
	}
}
