package com.day3.examProctor;

public class StackLinkedList {
	StackNode top;
	
	void push(String ques) {
		StackNode newNode=new StackNode(ques);
		newNode.next=top;
		top=newNode;
		
	}
	
	String pop() {
		if(top==null) {
			System.out.println("stack underflow");
			return "-1";
		}
		String popped=top.question;
		top=top.next;
		return popped;
	}
	
	
	String peek() {
		return top==null ? "-1" : top.question;
	}
}
