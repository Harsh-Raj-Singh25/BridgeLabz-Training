package com.reflection.basic_level.dynamicObjectCreation;

import java.lang.reflect.Constructor;

class Student {
	String name;

	public Student() {
		this.name = "Default Student";
	}

	public void display() {
		System.out.println("Student Name: " + name);
	}

}
