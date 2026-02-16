package com.multithreading.restaurantOrderSystem;

public class Chef extends Thread {
	private String dish;
	private int prepTimeMs;
	
	public Chef(String name, String dish, double prepTimeSeconds) {
		super(name);
		this.dish=dish;
		this.prepTimeMs=(int)(prepTimeSeconds * 1000);
		
	}
	
	@Override
	public void run() {
		System.out.println(getName() +" started preparing the "+dish);
		
		try {
			// display progress
			for(int i=1;i<=4; i++) {
				Thread.sleep(prepTimeMs/ 4);
				System.out.println(getName() + " preparing " + dish + ": " + (i * 25) + "% complete");
			}
			System.out.println(getName() + " finished the "+ dish);
		}
		catch(InterruptedException e) {
			System.out.println(getName() + " was interrupted");
		}
	}
}
