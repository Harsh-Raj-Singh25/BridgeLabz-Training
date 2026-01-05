package com.linkedlist.SinglyLinkedList.InventoryManagementSystem;

public class InventoryLinkedList {
	InventoryNode head;
	
	// add item at beginning
	void insertAtHead(String Name,String ID, double quantity, double price) {
		InventoryNode newNode=new InventoryNode(Name,ID,quantity,price);
		newNode.next=head;
		head=newNode;
		System.out.println("The item added at beginning");
	}
	// add item at end
	void insertAtEnd(String Name,String ID, double quantity, double price) {
		InventoryNode newNode=new InventoryNode(Name,ID,quantity,price);
		if(head==null) {
			head=newNode;
			return;
		}
		InventoryNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	
	// Remove an item based on Item ID.
	void deleteByID(String id) {

		if(head==null) {
			return;
		}
		// if item to be deleted is head
		if(head.ID==id) {
			head=head.next;
			System.out.println("Item ID:"+id+" Deleted");
			return;
		}
		InventoryNode temp=head;
		while(temp.next!=null && temp.next.ID!=id) {
			temp=temp.next;
		}
		if(temp.next!=null) {
			temp=temp.next.next;
			System.out.println("Item ID:"+ id+ " deleted");
		}else {
			System.out.println("Item not found");
		}
	}
	
	//Update the quantity of an item by Item ID.
	void updateById(String id, double quantity) {
		InventoryNode temp=head;
		while(temp.next!=null) {
			if(temp.ID==id) {
				temp.quantity=quantity;
				System.out.println("Quantity updated at ItemId :"+id);
				return;
			}
			temp=temp.next;
		}
		System.out.println(" The ID not found");
	}
	
	//Search for an item based on Item ID or Item Name.
	void searchByID(String id) {
		InventoryNode temp=head;
		while(temp.next!=null) {
			if(temp.ID==id) {
				System.out.println("Item found in inventory.\n Item Name :"+temp.ItemName);
				return;
			}
			temp=temp.next;
		}
		System.out.println("The item not found");
	}
	//Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
	void calculateTotalValue() {
		InventoryNode temp=head;
		double totalValue=0.0;
		while(temp.next!=null) {
			totalValue+=temp.price*temp.quantity;
			temp=temp.next;
		}
		System.out.println(" The total Value of inventory is : "+totalValue);
	}
	
	//Sort the inventory based on Item Name or Price in ascending or descending order.
	// by price
    public void sortByPrice() {
        if (head == null || head.next == null) return;
        boolean swapped;
        do {
            swapped = false;
            InventoryNode temp = head;
            while (temp.next != null) {
                if (temp.price > temp.next.price) {
                    // Swap data
                    double tempPrice = temp.price;
                    temp.price = temp.next.price;
                    temp.next.price = tempPrice;

                    String tempName = temp.ItemName;
                    temp.ItemName = temp.next.ItemName;
                    temp.next.ItemName = tempName;

                    String ID = temp.ID;
                    temp.ID = temp.next.ID;
                    temp.next.ID = ID;

                    double tempQty = temp.quantity;
                    temp.quantity = temp.next.quantity;
                    temp.next.quantity = tempQty;
                    
                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);
    }
    
    // displaying the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        InventoryNode temp = head;
        System.out.println("\n--- Inventory Records ---");
        while (temp != null) {
            System.out.println("ItemName: " + temp.ItemName + " | ID: " + temp.ID + 
                               " | Price: " + temp.price+ " | Quantity : " + temp.quantity);
            temp = temp.next;
        }
    }
    
}
