package com.multithreading.threadStateMonitor;

public class ThreadStateSystem {
	public static void main(String[] args) throws InterruptedException {
		// Task 1: Create threads (State: NEW)
		TaskRunner task1 = new TaskRunner("Task-1");
		TaskRunner task2 = new TaskRunner("Task-2");

		// Task 2: Create and start monitor
		StateMonitor monitor = new StateMonitor(task1, task2);

		// Let's see them in NEW state
		System.out.println("[Monitor] Initial Check:");
		System.out.println(task1.getName() + " Initial State: " + task1.getState());

		monitor.start();

		// Start tasks (State transition: NEW -> RUNNABLE)
		task1.start();
		task2.start();

		// Wait for monitor to finish
		monitor.join();

		System.out.println("\nSummary: Tasks progressed through NEW -> RUNNABLE -> TIMED_WAITING -> TERMINATED");
	}
}