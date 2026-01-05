package com.linkedlist.SinglyLinkedList.InventoryManagementSystem;

public class Main {
	public static void main(String[] args) {
		InventoryLinkedList list=new InventoryLinkedList();
		
		// calling methods
		list.insertAtHead("Mouse", "M01",5 , 150);
		list.insertAtEnd("Keyboard","k01", 12, 500);
		list.insertAtEnd("Monitor", "Mo-02", 10, 3000);
		list.insertAtEnd("CPU", "C-01", 15, 5000);
		list.display();
		
		// delete and update
		list.deleteByID("Mo-02");
		list.updateById("k01", 15);
		list.display();
		
		// searching and sorting and price calculation
		list.searchByID("M01");
		list.sortByPrice();
		list.display();
		list.calculateTotalValue();
		
		
		
		
	}
}
