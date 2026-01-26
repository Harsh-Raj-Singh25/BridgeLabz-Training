package com.annotations.custom.intermediate.fieldLevelAnnotations;

public class ValidationDemo {
	public static void main(String[] args) {
		try {
			System.out.println("Creating valid user...");
			new User("Harsh");

			System.out.println("Creating invalid user...");
			new User("VeryLongUsernameIndeed");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}