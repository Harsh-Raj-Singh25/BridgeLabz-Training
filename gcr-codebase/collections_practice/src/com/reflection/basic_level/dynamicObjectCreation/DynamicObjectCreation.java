package com.reflection.basic_level.dynamicObjectCreation;

import java.lang.reflect.Constructor;

public class DynamicObjectCreation {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.reflection.basic_level.dynamicObjectCreation.Student"); //we had to put className original along with path 

		//  Get the default constructor
		Constructor<?> constructor = clazz.getDeclaredConstructor();

		// Create instance (equivalent to 'new Student()')
		Object obj = constructor.newInstance();

		//  Verify by calling a method
		Student s = (Student) obj;
		s.display();
	}
}