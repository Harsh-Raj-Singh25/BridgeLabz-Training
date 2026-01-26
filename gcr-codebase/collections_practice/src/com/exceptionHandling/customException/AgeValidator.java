package com.exceptionHandling.customException;

import java.util.Scanner;

public class AgeValidator {

	//  Define the method that 'throws' the custom exception
	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			// Manually trigger the exception
			throw new InvalidAgeException("Age must be 18 or above");
		} else {
			System.out.println("  Access granted!");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your age to access the system: ");
		try {
			int userAge = scanner.nextInt();

			//  Call the method inside a try-catch block
			validateAge(userAge);

		} catch (InvalidAgeException e) {
			//  Handle the specific custom error
			System.out.println(" Registration Failed: " + e.getMessage());
		} catch (Exception e) {
			System.out.println(" Please enter a valid numerical age.");
		} finally {
			scanner.close();
		}
	}
}