package com.day2.TextEditor;

public class UndoRedoStackLL {
	StackNode top;
	
	void push(String action) {
		StackNode newNode= new StackNode(action);
		newNode.next=top;
		top=newNode;
	}
	
	// pop
	String pop() {
		if(top == null) {
			System.out.println(" Stack Underflow");
			return "-1";
		}
		String popped= top.action;
		top=top.next;
		return popped;
	}
	
	String peek() {
		return top == null ? "-1" : top.action;
	}
}
