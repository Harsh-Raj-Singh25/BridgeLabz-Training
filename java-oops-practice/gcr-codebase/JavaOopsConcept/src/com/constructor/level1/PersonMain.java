package com.constructor.level1;

public class PersonMain {
	public static void main(String [] args) {
		// calling default constructor
		Person person1=new Person();
		person1.displayDetails();
		
		// calling parameterized constructor
		Person person2=new Person("Raj",25);
		person2.displayDetails();
		
		// calling a copy constructor that will copy the details of person2
		Person person3= new Person(person2);
		person3.displayDetails();
	}
}
