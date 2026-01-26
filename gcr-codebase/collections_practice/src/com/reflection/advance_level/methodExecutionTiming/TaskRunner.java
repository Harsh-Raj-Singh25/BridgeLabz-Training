package com.reflection.advance_level.methodExecutionTiming;

//A class with methods we want to profile
class TaskRunner {
	public void quickTask() {
		System.out.println("Executing quick task...");
	}

	public void mediumTask() throws InterruptedException {
		System.out.println("Executing medium task...");
		Thread.sleep(100); // 100ms delay
	}

	public void slowTask() throws InterruptedException {
		System.out.println("Executing slow task...");
		Thread.sleep(500); // 500ms delay
	}
}
