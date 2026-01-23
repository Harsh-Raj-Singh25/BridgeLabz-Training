package com.day1.AmbulanceRoute;

public class RouteCircularLinkedList {
	UnitNode head;
	UnitNode tail;
	
	void insertAtEnd(String name, int capacity) {
		UnitNode newNode=new UnitNode(name, capacity);
		if(head==null) {
			head=tail=newNode;
			tail.next=head;
			return;
		}
		tail.next=newNode;
		newNode.next=head;
		tail=newNode;
	}
	
	// to display the units
	void display() {
		if(head==null) {
			System.out.println("List is null");
			return;
		}
		UnitNode temp=head;
		do {
			System.out.print("|"+temp.unitname+ " : Seat available= "+temp.capacity+"| --> ");
			temp=temp.next;
		}while(temp != head);
		System.out.print("|"+head.unitname+" : Seat available= "+head.capacity);
		System.out.println();
	}
	// to check the bed availability and admit the patient
	void checkAvailability(int patient) { //  checking by number of patients
		if(head==null) {
			return;
		}
		UnitNode temp=head;
		boolean found=false;
		do {
			if(temp.capacity>=patient ) {
				System.out.println("The patient admitted in "+temp.unitname+"");
				temp.capacity-=patient;
				found=true;
				return ;
			}
			System.out.println("The Unit :"+temp.unitname+" is full. Moving to the next unit");
			temp=temp.next;
		}while(temp!=head);
		
		if(!found) {
			System.out.println("Sorryy!!! Beds not available");
		}
	}
	
	// removing the unit that is under maintenance
	void removeUnit(String name) {
		if(head==null) {
			return ;
		}
		UnitNode temp=head, prev=tail;
		do {
			if(temp.unitname.equalsIgnoreCase(name)) {
				if(temp== head && temp==tail) {
					head=tail=null;
				}else {
					prev.next=temp.next;
					if(temp==head) {
						head=tail.next;
					}
					if(temp==tail) {
						tail=prev;
					}
				}
				System.out.println("Unit "+ name+" is under maintenance");
				return;
			}
			prev=temp;
			temp=temp.next;
			
		}while(temp!=head);
		
	}
	
	
}
