package com.reflection.basic_level.accessPrivateField;

import java.lang.reflect.Field;

public class PrivateFieldAccess {
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		Class<?> clazz = p.getClass();

		//  Get the private field
		Field ageField = clazz.getDeclaredField("age");

		//   Bypass private modifier
		ageField.setAccessible(true);

		// Modify and retrieve
		ageField.set(p, 35);
		System.out.println(" Modified Age: " + ageField.get(p));
	}
}