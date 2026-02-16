package com.multithreading.restaurantOrderSystem;

public class RestaurantSystem {
	public static void main(String[] args) {
		Chef chef1=new Chef("Chef-1","Pasta",3.0);
		Chef chef2=new Chef("Chef-2","Noodles",5.0);
		Chef chef3=new Chef("Chef-3","Manchurian",6.0);
		Chef chef4=new Chef("Chef-4","Momos",4.5);
		
		// start execution
		chef1.start();
		chef2.start();
		chef3.start();
		chef4.start();
		
		try {
			// main thread waits for other threads to complete
			chef1.join();
			chef2.join();
			chef3.join();
			chef4.join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(" All orders completed !!!! ");
	}
}
