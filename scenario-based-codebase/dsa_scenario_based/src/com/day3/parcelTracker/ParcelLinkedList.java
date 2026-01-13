package com.day3.parcelTracker;
/*
 * 10. ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit →
Delivered. Each stage is a node in a Singly Linked List.
Requirements:
● Forward tracking through stages.
● Add custom intermediate checkpoints.
● Handle lost/missing parcels (null pointers).
 */
public class ParcelLinkedList {
	private StageNode head;
	
	// ADD: At the Beginning
    public void addFirst(String name) {
    	StageNode newNode = new StageNode(name);
        newNode.next = head;
        head = newNode;
        System.out.println("Stage added at the beginning.");
    }

    // ADD: At the End
    public void addLast(String name) {
    	StageNode newNode = new StageNode(name);
        if (head == null) {
            head = newNode;
            return;
        }
        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        //System.out.println("Stage added at the end.");
    }
    // link a new intermediate stage
    void addAfter(String targetstageName, String newStage) {
    	if(head==null) {
    		System.out.println(" Chain is empty");
    		return;
    	}
    	StageNode temp=head;
    	while(temp!=null && !temp.stageName.equalsIgnoreCase(targetstageName)) {
    		temp=temp.next;
    	}
    	if(temp!=null) {
    		StageNode newNode=new StageNode(newStage);
    		newNode.next=temp.next;
    		temp.next=newNode;
    		System.out.println("CheckPoint: ["+ newStage+ "] added after ["+targetstageName);
    	}else {
    		System.out.println(" Target Stage:"+ targetstageName+ " not found");
    	}
    }
    // check for delivery status
    public void checkDeliveryStatus() {
        if (head == null) return;

        StageNode temp = head;
        while (temp != null) {
            if (temp.stageName.equalsIgnoreCase("Delivered")) {
                System.out.println(" Status: Parcel successfully reached the final destination.");
                return;
            }
            // If we are at a stage that isn't 'Delivered' and there is no 'next' node...
            if (temp.next == null) {
                System.out.println(" Status: DISCONTINUITY DETECTED! Parcel lost after " + temp.stageName);
                return;
            }
            temp = temp.next;
        }
    }
    
    
    
    // display forward
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        StageNode temp = head;
        System.out.println("\n--- Parcel Stage Records ---");
        while (temp != null) {
            System.out.println("Stage name:"+temp.stageName);
            temp = temp.next;
        }
    }
    
    
}
