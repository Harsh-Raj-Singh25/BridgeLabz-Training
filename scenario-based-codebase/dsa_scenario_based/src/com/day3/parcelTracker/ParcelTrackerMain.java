package com.day3.parcelTracker;

public class ParcelTrackerMain {
	public static void main(String [] args) {
		ParcelLinkedList stages=new ParcelLinkedList();
		
		stages.addLast("Packed");
		stages.addLast("Shipped");
		stages.addLast("In Transit");
		stages.addLast("Delivered");
		
		System.out.println("----------------------------------------");
		System.out.println("WELCOME TO THE PARCEL TRACKER APPLICATION");
		System.out.println("-----------------------------------------");
		stages.display();
		
		// check delivery status
		stages.checkDeliveryStatus();
		// add an intermediate checkpoint
		stages.addAfter("Shipped", "Arrived in Country");
		//final stages
		stages.display();
		
	}
}
