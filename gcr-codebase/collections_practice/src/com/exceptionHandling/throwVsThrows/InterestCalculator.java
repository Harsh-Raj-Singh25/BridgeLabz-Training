package com.exceptionHandling.throwVsThrows;

public class InterestCalculator {

	// 'throws' in the signature warns the caller about potential exceptions
	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

		// 'throw' is used to actually trigger the exception if conditions are met
		if (amount < 0 || rate < 0) {
			throw new IllegalArgumentException("Amount and rate must be positive");
		}

		// Standard Simple Interest Formula: (P * R * T) / 100
		return (amount * rate * years) / 100;
	}

	public static void main(String[] args) {
		try {
			System.out.println("--- Scenario 1: Valid Input ---");
			double validResult = calculateInterest(1000, 5.5, 2);
			System.out.println("Calculated Interest: Rs." + validResult);

			System.out.println("\n--- Scenario 2: Invalid Input ---");
			// This will trigger the exception and jump to the catch block
			double invalidResult = calculateInterest(-500, 4.0, 3);
			System.out.println("Calculated Interest: Rs." + invalidResult);

		} catch (IllegalArgumentException e) {
			// 3. The exception was 'propagated' here and is now handled
			System.out.println("Invalid input: " + e.getMessage());
		}
	}
}
