package com.reflection.basic_level.classInformation;

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInspector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full class name (e.g., java.lang.String): ");
		String className = sc.nextLine();

		try {
			Class<?> clazz = Class.forName(className);

			System.out.println("\n--- Fields ---");
			for (Field f : clazz.getDeclaredFields())
				System.out.println(f.getName());

			System.out.println("\n--- Methods ---");
			for (Method m : clazz.getDeclaredMethods())
				System.out.println(m.getName());

			System.out.println("\n--- Constructors ---");
			for (Constructor<?> c : clazz.getDeclaredConstructors())
				System.out.println(c.getName());

		} catch (ClassNotFoundException e) {
			System.out.println(" Class not found!");
		}
	}
}