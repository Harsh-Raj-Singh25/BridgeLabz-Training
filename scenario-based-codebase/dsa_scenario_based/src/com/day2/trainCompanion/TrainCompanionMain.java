package com.day2.trainCompanion;
/*
 * 5. TrainCompanion – Compartment Navigation System (Doubly Linked
List)
Story: In a long-distance train app, passengers can walk to the next or previous compartment,
or search for services (like pantry, WiFi). Each compartment is a node in a Doubly Linked List.
Requirements:
● Traverse forward or backward.
● Insert/Remove compartments dynamically.
● Display adjacent compartments for quick decisions.

 */
public class TrainCompanionMain {
	public static void main(String [] args) {
		TrainLinkedList train=new TrainLinkedList();
		
		// adding the compartments and the services
		train.insertAtHead("S-1", "Sleeper");
		train.insertAtHead("S-2", "Sleeper");
		train.insertAtHead("HSB", "Pantry");
		train.insertAtHead("HSV", "ServiceStaff");
		train.insertAtHead("B-1", "AC sleeper");
		train.insertAtHead("B-2", "AC Sleeper");
		train.insertAtHead("W-1", "Wifi");
		train.insertAtHead("E-1", "Engine");
		
		train.printTrainState();
		//display forward
		train.displayForward();
		
		// delete a compartment
		train.deleteByName("S-2");
		
		// search by service
		train.searchByService("Wifi");
		
		train.printTrainState();
		// display adjacent compartments
		train.displayAdjacent("HSB");
	}
}
