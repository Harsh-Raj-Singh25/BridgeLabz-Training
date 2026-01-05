package com.linkedlist.CircularLinkedList.TaskScheduler;

public class TaskSchedulerList {
	TaskNode head;
	TaskNode tail;
	
	//Add a task at the beginning, end, or at a specific position in the circular list.
	void insertAtStart(String taskID, String taskname, int priority, int date) {
		TaskNode newNode=new TaskNode(taskID, taskname, priority, date);
		
		if(head==null) {
			head=tail=newNode;
			tail.next=head;
		}else {
			newNode.next=head;
			head=newNode;
			tail.next=head;
		}
	}
	void insertAtEnd(String taskID, String taskname, int priority, int date) {
		TaskNode newNode=new TaskNode( taskID, taskname,  priority,  date);
		if(head ==null) {
			head=tail=newNode;
			tail.next=head;
		}else {
			tail.next=newNode;
			newNode.next=head;
			tail=newNode;
		}
	}
	
	//	Remove a task by Task ID.
	void removetask(String Id) {
		if(head==null) return;
		TaskNode temp=head;
		TaskNode prev=tail;
//		while(temp.next!=head) {
//			if(temp.next.taskID.equalsIgnoreCase(Id)) {
//				temp.next=temp.next.next;
//				System.out.println("Item removed");
//				return;
//			}else {
//				System.out.println("item not found");
//			}
//			temp=temp.next;
//		}
		do {
			if(temp.taskID==Id) {
				if(temp==head & temp==tail) {
					head=tail=null;
				}
				else if(temp==head) {
					head=head.next;
					tail.next=head;
				}else if( temp==tail) {
					tail=prev;
					tail.next=head;
				}
				System.out.println("Removed task ID:-" + Id);
			}
			prev=temp;
			temp=temp.next;
		}while(temp!=head);
	}
	//	View the current task and move to the next task in the circular list.
	void viewAndMove() {
		TaskNode temp=head;
		while(temp.next!=head) {
			System.out.println("The current task is :"+temp.taskID +"->"+temp.taskname+" ");
			temp=temp.next;
		}
	}
	//	Display all tasks in the list starting from the head node.
	void display() {
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    TaskNode temp = head;
	    System.out.println("Circular List: ");

	    do {
	        System.out.println("Task Name:"+temp.taskname+"| ID:"+temp.taskID+"| Priority:"+temp.priority);
	        temp = temp.next;
	    } while (temp != head);
	}

	//	Search for a task by Priority.
	void findTask(int priority) {
		if(head==null) {
			System.out.println("The list is empty");
			return;
		}

		TaskNode temp=head;
		do {
			if(temp.priority==priority) {
				System.out.println("The task :"+temp.taskname+" was found");
				return;
			}
			temp=temp.next;
		}while(temp!=head);
		System.out.println("task not found");
	}
}
