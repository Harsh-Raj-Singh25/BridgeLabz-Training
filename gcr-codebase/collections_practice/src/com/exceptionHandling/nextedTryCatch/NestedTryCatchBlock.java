package com.exceptionHandling.nextedTryCatch;

import java.util.Scanner;

public class NestedTryCatchBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = { 100, 200, 300 };

		try {
			// Outer Try: Handles Array Indexing
			System.out.print("Enter array index (0-2): ");
			int index = sc.nextInt();

			int numerator = numbers[index]; // Potential ArrayIndexOutOfBoundsException

			try {
				// Inner Try: Handles Mathematical Division
				System.out.print("Enter divisor: ");
				int divisor = sc.nextInt();

				int result = numerator / divisor; // Potential ArithmeticException
				System.out.println("Result: " + result);

			} catch (ArithmeticException e) {
				System.out.println("Inner Catch: Cannot divide by zero!");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Outer Catch: Invalid array index!");
		} catch (Exception e) {
			System.out.println(" General Catch: An unexpected error occurred.");
		} finally {
			sc.close();
			System.out.println(" Resources closed.");
		}
	}
}
