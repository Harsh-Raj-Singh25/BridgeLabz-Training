package com.day2.TextEditor;

public class StackNode {
	StackNode next;
	String action;
	
	StackNode(String action){
		this.action=action;
		this.next=null;
	}
		
}
