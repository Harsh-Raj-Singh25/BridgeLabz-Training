package com.constructor.level1;

public class Person {
	// attributes
	String name;
	int age;
	
	// default constructor
	Person(){
		name="Harsh";
		age=20;
		
	}
	// parameterized constructor
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	// copy constructor
	Person(Person previousPerson){
		this.name=previousPerson.name;
		this.age=previousPerson.age;
	}
	
	// method to display the details:
	void displayDetails() {
		System.out.println("The person name is : "+ name);
		System.out.println("Age is: "+ age);
	}
	
}
