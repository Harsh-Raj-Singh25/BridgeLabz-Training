package com.exceptionHandling.customChecked;

import java.util.Scanner;

public class BankSystem {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(500.00);
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================");
		System.out.println("WELCOME TO THE BANK SYSTEM");
		System.out.println("========================");
		try {
			System.out.print("Enter amount to withdraw: ");
			double amount = sc.nextDouble();

			myAccount.withdraw(amount);

		} catch (InsufficientBalanceException e) {
			// Handling our custom business rule error
			System.out.println(" !!!Transaction Failed: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			// Handling the invalid input error
			System.out.println(" !!!Input Error: " + e.getMessage());
		} catch (Exception e) {
			// Catching any other issues (like non-numeric input)
			System.out.println( "!!!System Error: Please enter a valid number.");
		} finally {
			sc.close();
			System.out.println("  ##Thank you for using DigiBank.");
		}
	}
}