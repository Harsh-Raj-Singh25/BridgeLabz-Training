package com.day9_BST.universityRecord;
/*
 * Story: University's Digital Record System
The university needs an efficient way to manage student records searchable by roll number.
Scenarios:
● 🔹 Scenario 1: Insertion — As students enroll, insert their roll numbers with personal
details.
● 🔹 Scenario 2: Deletion — If a student leaves, remove their record.
● 🔹 Scenario 3: Search & Display — A professor wants a sorted list of student roll numbers for attendance.
 */
public class StudentNode {
	String name;
	private int rollNumber;
	StudentNode left, right;
	
	// constructor to initialize the data
	StudentNode(String name, int roll){
		this.name=name;
		this.rollNumber=roll;
		left=right=null;
	}
	// getter for accessing roll number
	public int getRoll() {
		return rollNumber;
	}
	public void setRoll(int num) {
		this.rollNumber=num;
	}
}
