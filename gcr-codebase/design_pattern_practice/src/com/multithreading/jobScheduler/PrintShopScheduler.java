package com.multithreading.jobScheduler;


public class PrintShopScheduler {
	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();

		// Task 1: Create Print Jobs
		PrintJob[] jobs = { new PrintJob("Job1", 10, 5), new PrintJob("Job2", 5, 8), new PrintJob("Job3", 15, 3),
				new PrintJob("Job4", 8, 6), new PrintJob("Job5", 12, 7) };

		Thread[] threads = new Thread[jobs.length];

		System.out.println("🚀 Starting print jobs...\n");

		for (int i = 0; i < jobs.length; i++) {
			threads[i] = new Thread(jobs[i], "Thread-" + (i + 1));

			// Task 2: Set Thread Priority (Ensure it stays within 1-10 range)
			threads[i].setPriority(Math.min(10, Math.max(1, i + 3))); // Mapping logic
			// Note: Manual mapping for specific task requirements:
			if (i == 1)
				threads[i].setPriority(Thread.MAX_PRIORITY); // Job2 (8)
			if (i == 2)
				threads[i].setPriority(Thread.MIN_PRIORITY); // Job3 (3)
		}

		// Start all threads
		for (Thread t : threads) {
			t.start();
		}

		// Task 5: Wait for all jobs to track total time
		for (Thread t : threads) {
			t.join();
		}

		long endTime = System.currentTimeMillis();
		System.out.println("\n All jobs completed in " + (endTime - startTime) + "ms");
	}
}