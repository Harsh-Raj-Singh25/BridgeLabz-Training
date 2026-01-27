package com.jUnit.com.performanceTesting;

public class Heavytask {
	public String longRunningTask() throws InterruptedException {
		Thread.sleep(3000); // Sleeps for 3 seconds
		return "Success";
	}
}