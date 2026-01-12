package com.day2.trainCompanion;

public class TrainNode {
	String nameOfCompartment;
	String serviceType;
	TrainNode prev;
	TrainNode next;
	
	TrainNode(String name, String type){
		this.nameOfCompartment=name;
		this.serviceType=type;
		this.next=null;
		this.prev=null;
	}
}
