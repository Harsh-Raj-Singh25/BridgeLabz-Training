package com.exceptionHandling.finallyBlock;

import java.util.Scanner;

public class FinallyExecutionDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter numerator: ");
			int num1 = scanner.nextInt();

			System.out.print("Enter denominator: ");
			int num2 = scanner.nextInt();

			// This line triggers ArithmeticException if num2 is 0
			int result = num1 / num2;
			System.out.println(" Result: " + result);

		} catch (ArithmeticException e) {
			// This runs ONLY if division by zero occurs
			System.out.println("Error: Division by zero is not allowed.");
		} catch (Exception e) {
			// This runs for other errors (like entering text instead of numbers)
			System.out.println("Error: Invalid input provided.");
		} finally {
			// This runs NO MATTER WHAT
			System.out.println("Notification: Operation completed.");
			scanner.close();
		}
	}
}