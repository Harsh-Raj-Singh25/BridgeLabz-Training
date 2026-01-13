package com.day2.trafficManager;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 7. TrafficManager – Roundabout Vehicle Flow (Circular Linked List +
Queue)
Story: A smart city roundabout allows vehicles to enter and exit dynamically. Each vehicle is a
node in a Circular Linked List. A Queue manages vehicles waiting to enter.
Requirements:
● Add or remove cars in a circular path.
● Queue overflow/underflow handling.
● Print state of roundabout at any time.
 */

public class TrafficManagerMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<String> vehicleQueue = new LinkedList<>();
		// feeding some vehicles in the queue
		System.out.println("=======================================");
		System.out.println("----WELCOME TO THE TRAFFIC MANAGER----");
		System.out.println("---------------------------------------");
		System.out.println(" Enter the name of 4 vehicles in the queue");
		for(int i=0;i<4;i++) {
			String id=sc.nextLine().trim();
			vehicleQueue.offer(id);
		}
		// creating a circular linked list representing the traffic on road
		VehicleCLL roundabout = new VehicleCLL();
		// entering 4 vehicles in the traffic
		for (int i = 0; i < 3; i++) {
			if (!vehicleQueue.isEmpty()) {
				String id = vehicleQueue.poll();
				roundabout.insertAtEnd("Car:-" + (i + 1), id);
			}
		}
		// current roundabout state
		System.out.println(" The current roundabout state of traffic");
		roundabout.roundAbout("");

		// removing a car dynamically
		System.out.println(" Enter the car exiting the traffic");
		String exitId=sc.nextLine();
		System.out.println(" The car "+exitId+ " is exiting");
		roundabout.removeByID(exitId);
		// checking if the queue has a car and entering the first car in the queue
		if (!vehicleQueue.isEmpty()) {
			System.out.println("A new vehicle is entering");
			String newId = vehicleQueue.poll();
			roundabout.insertAtEnd("New Car", newId);
		}
		
		// current roundabout state 
		roundabout.roundAbout("");
	}
}
