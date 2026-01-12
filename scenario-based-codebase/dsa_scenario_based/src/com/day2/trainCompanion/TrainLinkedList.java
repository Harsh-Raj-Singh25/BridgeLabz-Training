package com.day2.trainCompanion;

//doubly linked list
public class TrainLinkedList {
	TrainNode head;
	TrainNode tail;

	// link compartments in the train
	void insertAtHead(String name, String type) {
		TrainNode newNode = new TrainNode(name, type);
		if (head == null) {
			head = tail = newNode;

		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		System.out.println("The compartment added at the beginning");

	}

	// remove compartments dynamically
	void deleteByName(String name) {
		if (head == null) {
			return;
		}
		// if item to be deleted is head
		if (head.nameOfCompartment.equalsIgnoreCase(name)) {
			head = head.next;
			if (head != null) {
	            head.prev = null; // 🔥 FIX: The new Engine must not point back to a deleted car
	        } else {
	            tail = null; // Train is now empty
	        }
			System.out.println(" Compartment :" + name + " deleted from train");
			return;
		}
		TrainNode temp = head;
		while (temp.next != null && !temp.next.nameOfCompartment.equalsIgnoreCase(name)) {
			temp = temp.next;
		}

		
		if (temp.next != null) {
			// Create a temporary reference to the node we are skipping
			TrainNode nodeToDelete = temp.next;
			temp.next=nodeToDelete.next ;
			// updating prev only if the new temp has a next node
			if (temp.next != null) {
				temp.next.prev = temp;
			} else {
				tail = temp; // if we deleted the tail.
			}
			System.out.println(" Compartment : " + name + " deleted");

		} else {
			System.out.println("Compartment not found");
		}
	}

	// search for a service in the train
	void searchByService(String service) {
		if (head == null) {
			System.out.println(" NO services");
			return;
		}
		// replaced these lines because we are now traversing through the head itself so
		// these lines are not required now
//		// if item to be found is head
//		if (head.serviceType.equalsIgnoreCase(service)) {
//			//head = head.next;
//			System.out.println(" Service :" + head.serviceType + " found");
//			return;
//		}
		TrainNode temp = head;
		boolean found = false;
		while (temp != null) {
			if (temp.serviceType.equalsIgnoreCase(service)) {
				System.out.println("Service Type :" + service + " found in  compartment:" + temp.nameOfCompartment);
				found = true;
			}
			temp = temp.next;
		}
		if (!found) {
			System.out.println(" Service not found");

		}
	}

	// Display all compartments in forward order
	// forward
	void displayForward() {
		TrainNode temp = head;
		System.out.println("Forward compartment List:");
		while (temp != null) {
			System.out
					.println("Compartment Name : " + temp.nameOfCompartment + " ||Service Type : " + temp.serviceType);
			temp = temp.next;
		}
	}

	// display adjacent compartments
	void displayAdjacent(String name) {
		if (head == null) {
			System.out.println(" No Compartments");
			return;
		}
		TrainNode temp = head;
		while (temp != null) {
			if (temp.nameOfCompartment.equalsIgnoreCase(name)) {
				System.out.println("Adjacent Compartments of compartment " + name + " :");
				if (temp.prev != null) {
					System.out.println(" Go Back to : Compartment-" + temp.prev.nameOfCompartment + "| Service :"
							+ temp.prev.serviceType);
				} else {
					System.out.println(" No Previous compartment / [Engine]");
				}
				if (temp.next != null) {
					System.out.println(" Go Forward to : Compartment-" + temp.next.nameOfCompartment + " | Service :"
							+ temp.next.serviceType);
				} else {
					System.out.println("GO forward: to end of train");
				}
				return;
			}
			temp = temp.next;
		}
		System.out.println(" No Adjacent compartments");
	}
	
	
	void printTrainState() {
	    System.out.println("\n---  DEBUG: TRAIN STATE ---");
	    if (head == null) {
	        System.out.println("The train is currently EMPTY (Head is null).");
	    } else {
	        System.out.println("CURRENT HEAD: " + head.nameOfCompartment);
	        System.out.println("CURRENT TAIL: " + (tail != null ? tail.nameOfCompartment : "null"));
	    }
	    System.out.println("----------------------------\n");
	}
}
