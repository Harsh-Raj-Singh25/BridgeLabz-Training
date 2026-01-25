package budgetWiseFinanceTracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Base Budget Class
abstract class Budget {
	protected double income;
	protected List<Transaction> transactions;
	protected Map<String, Double> categoryLimits;

	public Budget(double income) {
		this.income = income;
		this.transactions = new ArrayList<>();
		this.categoryLimits = new HashMap<>();
	}

	// Encapsulation: Restrict direct expense editing
	// Expenses can only be added through this validated method
	public void addTransaction(double amount, String type, String category, String date) {
		if (amount <= 0) {
			System.out.println("Invalid amount!");
			return;
		}
		transactions.add(new Transaction(amount, type, category, date));
	}

	// Use operators/logic to calculate net savings
	public double calculateNetSavings() {
		double totalExpenses = 0;
		for (Transaction t : transactions) {
			if (t.type.equalsIgnoreCase("Expense")) {
				totalExpenses += t.amount;
			}
		}
		return income - totalExpenses; // income - totalExpenses calculation
	}
}
