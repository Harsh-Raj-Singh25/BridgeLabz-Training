package com.functional_interface.functional_interfaces.backgroundJob;

public class BackgroundJob {
	public static void main(String[] args) {

		// Runnable logic: A task that prints a status update
		Runnable databaseBackup = () -> {
			System.out.println(" Background Job: Starting database backup...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(" Background Job : Backup completed successfully.");
		};

		// Running the job in a new thread
		Thread thread = new Thread(databaseBackup);
		thread.start();

		System.out.println("Main thread is free to do other work...");
	}
}
