package com.day1.AmbulanceRoute;

public class AmbulanceRouteMain {
	public static void main(String[] args) {
		RouteCircularLinkedList hospital=new RouteCircularLinkedList();
		
		hospital.insertAtEnd("Emergency",5);
		hospital.insertAtEnd("Radiology",10);
		hospital.insertAtEnd("Surgery",2);
		hospital.insertAtEnd("ICU",3);
		
		System.out.println(" Entering the hospital");
		System.out.println("Available units:");
		hospital.display();
		System.out.println("ICU under maintenance");
		hospital.removeUnit("ICU");
		System.out.println();
		
		int patient=6;
		System.out.println(" checking the availability");
		hospital.checkAvailability(patient);
		
	}
}
