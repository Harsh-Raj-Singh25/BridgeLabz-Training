package com.exceptionHandling.uncheckedException;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionHandler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the numerator (number to be divided): ");
			int numerator = sc.nextInt();

			System.out.print("Enter the denominator (number to divide by): ");
			int denominator = sc.nextInt();

			// This line might throw ArithmeticException
			int result = numerator / denominator;
			System.out.println(" Result: " + result);

		}
		// Handle Division by Zero
		catch (ArithmeticException e) {
			System.out.println(" Error: You cannot divide by zero!");
		}
		// Handle Non-Numeric Input (e.g., entering "hello" instead of 5)
		catch (InputMismatchException e) {
			System.out.println(" Error: Please enter valid whole numbers only.");
		}
		// Generic catch-all for any other unexpected runtime issues
		catch (Exception e) {
			System.out.println(" An unexpected error occurred: " + e.getMessage());
		} finally {
			System.out.println(" Scanner connection closed.");
			sc.close();
		}
	}
}