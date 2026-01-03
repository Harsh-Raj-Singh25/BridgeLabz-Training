package EWalletApplication;

import java.util.ArrayList;
import java.util.List;

// BASE CLASS: Represents a general digital wallet
abstract class Wallet {
	// ENCAPSULATION: balance is private to prevent unauthorized manipulation
	private double balance;
	private List<String> history;

	// CONSTRUCTOR: Initializes balance and adds a referral bonus if applicable
	public Wallet(double initialLoad, double referralBonus) {
		// OPERATORS: Summing initial load and bonus
		this.balance = initialLoad + referralBonus;
		this.history = new ArrayList<>();
		addHistory("Wallet created with initial load: " + initialLoad + " and Bonus: " + referralBonus);
	}

	// GETTER: Controlled access to sensitive balance data
	public double getBalance() {
		return balance;
	}

	// PROTECTED METHODS: Internal logic for subclasses to update balance
	protected void deposit(double amount) {
		this.balance += amount;
		addHistory("Received: Rs. " + amount);
	}

	protected boolean withdraw(double amount) {
		if (amount <= balance) {
			this.balance -= amount;
			addHistory("Sent/Deducted: Rs. " + amount);
			return true;
		}
		System.out.println("Error: Insufficient Funds!");
		return false;
	}

	protected void addHistory(String transaction) {
		history.add(transaction);
	}

	public void viewHistory() {
		System.out.println("--- Transaction History ---");
		for (String record : history)
			System.out.println(record);
	}
}




