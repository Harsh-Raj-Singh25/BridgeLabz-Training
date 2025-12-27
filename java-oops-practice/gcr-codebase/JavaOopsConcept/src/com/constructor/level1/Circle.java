package com.constructor.level1;

public class Circle {
	Double radius;
	
	// default constructor
	Circle(){
		radius=45.7;
	}
	
	//Constructor
	Circle(Double radius){
		this.radius=radius;
		System.out.println("the circle created with radius: "+ this.radius );
	}
	
	

}
