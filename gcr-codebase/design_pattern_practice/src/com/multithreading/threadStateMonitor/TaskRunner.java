package com.multithreading.threadStateMonitor;


class TaskRunner extends Thread {
	public TaskRunner(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			// State: RUNNABLE (performing computation)
			double result = 0;
			for (int i = 0; i < 1000000; i++) {
				result += Math.sqrt(i);
			}

			// State: TIMED_WAITING (sleeping for 2 seconds)
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			System.err.println(getName() + " interrupted.");
		}
	}
}

