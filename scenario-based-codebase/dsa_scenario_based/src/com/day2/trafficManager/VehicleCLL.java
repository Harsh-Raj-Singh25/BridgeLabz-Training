package com.day2.trafficManager;

public class VehicleCLL {
	VehicleNode head;
	VehicleNode tail;
	
	// insertion at the start of the linked list
	void insertAtStart(String vehicleName, String id) {
		VehicleNode newNode=new VehicleNode(id,vehicleName);
		
		if(head==null) {
			head=tail=newNode;
			tail.next=head;
			return;
		}else {
			newNode.next=head;
			head=newNode;
			tail.next=head;
		}
	}
	// insertion at the end of the list
	void insertAtEnd(String name, String id) {
		VehicleNode newNode=new VehicleNode(id,name);
		if(head==null) {
			head=tail=newNode;
			tail.next=head;
		}
		else {
			tail.next=newNode;
			newNode.next=head;
			tail=newNode;
		}
	}
	// removing by id
	void removeByID(String id) {
		if(head==null) {
			System.out.println("The list is already empty");
			return;
		}
		VehicleNode temp=head;
		VehicleNode prev=tail;
		do {
			if(temp.Id.equalsIgnoreCase(id)) {
				if(temp==head && temp==tail) {
					head=tail=null;
				}
				else if(temp==head) {
					head=head.next;
					tail.next=head;
				}else if(temp==tail) {
					tail=prev;
					tail.next=head;
				}
				System.out.println("Removed Vehicle from the traffic :"+id);
				return;
			}
			prev=temp;
			temp=temp.next;
		}while(temp!=head);
	}
	
	// state of roundabout
	void roundAbout(String id) {
		int count=0;
		if(head==null) {
			System.out.println("The list is empty");
			return;
		}
		VehicleNode temp=head;
		do {
			System.out.println("ID :"+temp.Id +"| Name:"+temp.vehicleName);
			count++;
			temp=temp.next;
		}while(temp!=head);
		System.out.println(" Back to head");
		System.out.println(" Total Vehicle crossed = "+count);
	}
	
	
}
