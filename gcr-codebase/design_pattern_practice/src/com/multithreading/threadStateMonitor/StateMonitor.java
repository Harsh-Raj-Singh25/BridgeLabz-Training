package com.multithreading.threadStateMonitor;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class StateMonitor extends Thread {
	private Thread t1, t2;
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

	public StateMonitor(Thread t1, Thread t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public void run() {
		boolean monitoring = true;
		System.out.println("[Monitor] Starting observation...");

		while (monitoring) {
			printState(t1);
			printState(t2);

			// Stop when both are TERMINATED
			if (t1.getState() == Thread.State.TERMINATED && t2.getState() == Thread.State.TERMINATED) {
				monitoring = false;
				System.out.println("\n[Monitor] All threads terminated. Observation complete.");
			}

			try {
				Thread.sleep(500); // Check every 500ms
			} catch (InterruptedException e) {
				break;
			}
		}
	}

	private void printState(Thread t) {
		System.out.println(
				"[Monitor] " + t.getName() + " is in " + t.getState() + " state at " + LocalTime.now().format(dtf));
	}
}
