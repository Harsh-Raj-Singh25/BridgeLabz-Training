package com.multithreading.jobScheduler;

class PrintJob implements Runnable {
	private String jobName;
	private int totalPages;
	private int priority;

	public PrintJob(String jobName, int totalPages, int priority) {
		this.jobName = jobName;
		this.totalPages = totalPages;
		this.priority = priority;
	}

	@Override
	public void run() {
		String priorityTag = getPriorityTag(priority);
		System.out.println(priorityTag + " Starting " + jobName + " (" + totalPages + " pages)");

		for (int i = 1; i <= totalPages; i++) {
			try {
				// Simulate printing time: 100ms per page
				Thread.sleep(100);
				System.out.println(priorityTag + " " + jobName + " - Page " + i + " of " + totalPages);
			} catch (InterruptedException e) {
				System.err.println(jobName + " was interrupted.");
			}
		}
		System.out.println("✅ Completed: " + jobName);
	}

	private String getPriorityTag(int p) {
		if (p >= 8)
			return "[High Priority]";
		if (p >= 5)
			return "[Medium Priority]";
		return "[Low Priority]";
	}
}
