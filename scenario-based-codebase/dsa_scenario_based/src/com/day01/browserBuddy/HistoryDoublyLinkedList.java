package com.day1.browserBuddy;

public class HistoryDoublyLinkedList {
	HistoryNode head;
	HistoryNode tail;
	
	void insertAtHead(String url) {
		HistoryNode newNode=new HistoryNode(url);
		if(head == null) {
			head=tail=newNode;
		}else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		System.out.println("tab added at the beginning");
		
	}
	void insertAtEnd(String url) {
		HistoryNode newNode=new HistoryNode(url);
		if(head == null) {
			head=tail=newNode;
		}else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		System.out.println("tab added at the end");
		
	}
	
	
}
