package com.linkedlist.CircularLinkedList.TaskScheduler;

public class Main {
	public static void main(String [] args) {
		TaskSchedulerList list=new TaskSchedulerList();
		
		// adding elements
		list.insertAtStart("s-1", "leetcode",2,01012026);
		list.insertAtEnd("s-2", "GCR", 03, 0401);
		list.insertAtEnd("s-3", "Scenario", 01, 0501);
		
		//
		list.display();
		list.removetask("s-2");
		list.viewAndMove();
		list.findTask(01);
		
	}
}
