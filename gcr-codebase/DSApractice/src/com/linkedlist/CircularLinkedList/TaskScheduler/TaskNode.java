package com.linkedlist.CircularLinkedList.TaskScheduler;

public class TaskNode {
	String taskID;
	String taskname;
	int priority;
	int dueDate;
	
	// next;
	TaskNode next;
	
	//constructor
	TaskNode(String taskID, String taskname, int priority, int date){
		this.dueDate=dueDate;
		this.priority=priority;
		this.taskID=taskID;
		this.taskname=taskname;
		this.next=null;
	}
}
