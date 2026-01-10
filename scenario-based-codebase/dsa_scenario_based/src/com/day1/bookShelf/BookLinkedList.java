package com.day1.bookShelf;

public class BookLinkedList {
	private BookNode head;
	
	public void addFirst(String name) {
		BookNode newNode= new BookNode(name);
		newNode.next=head;
		head=newNode;
		//System.out.println("The Book added to the Genre");
	}
	public void removeByName(String name) {
		if (head == null) {
			return;
		}
		if(head.name.equalsIgnoreCase(name)) {
			head=head.next;
		//	System.out.println("Book:"+name+" deleted");
			return;
		}
		
		BookNode temp=head;
//		while(temp.next!=null && temp.next.name !=name) {
//			temp=temp.next;
//		}
		while (temp.next != null && !temp.next.name.equalsIgnoreCase(name)) {
	        temp = temp.next;
	    }
		if(temp.next!=null) {
			temp.next=temp.next.next;
			System.out.println(" Name:"+ name+" deleted");
		}else {
			System.out.println("Book not found");
		}
	}
	
	public void displayBooks() {
		if(head==null) {
			System.out.println("The Genre is empty");
			return;
		}
		BookNode temp=head;
		System.out.println("--The Books of this genre are:");
		int i=1;
		while(temp!=null) {
			System.out.println((i++)+". Book name:"+temp.name);
			temp=temp.next;
		}
	}
	
	
}
