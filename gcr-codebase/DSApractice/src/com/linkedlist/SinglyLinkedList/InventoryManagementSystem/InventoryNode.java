package com.linkedlist.SinglyLinkedList.InventoryManagementSystem;

public class InventoryNode {
	// inventory details:
	String ItemName;
	String ID;
	double quantity;
	double price;
	
	// pointer to next Item in Inventory
	InventoryNode next;
	
	// constructor
	InventoryNode(String Name,String ID, double quantity, double price){
		this.ItemName=Name;
		this.ID=ID;
		this.quantity=quantity;
		this.price=price;
		this.next=null;
	}
	
}
