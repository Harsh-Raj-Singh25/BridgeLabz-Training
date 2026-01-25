package com.exceptionHandling.customChecked;

class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	// Method using both Checked and Unchecked Exceptions
	public void withdraw(double amount) throws InsufficientBalanceException {
		// Validation: Negative amount is a logical code error
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid amount! Amount must be positive.");
		}

		// Business Rule: Cannot spend more than you have
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance! Current balance: " + balance);
		}

		balance -= amount;
		System.out.println(" Withdrawal successful! New balance: " + balance);
	}
}