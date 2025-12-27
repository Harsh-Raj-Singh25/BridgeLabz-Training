package com.constructor.level1;

public class Student {
	public String rollNumber;
	protected String name;
	private double CGPA;
	
	Student(String rollNumber, String name, double CGPA){
		this.rollNumber=rollNumber;
		this.name=name;
		this.CGPA= CGPA;
	}
	
	public int modifyCgpa() {
		CGPA=cgpa*45;
		return CGPA;
	}
//	public getCGPA() {
//		return CGPA;
//	}
//	public getcgpa(double CGPA) {
//		this.CGPA=CGPA;
//	}
	
	// Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
    
}
