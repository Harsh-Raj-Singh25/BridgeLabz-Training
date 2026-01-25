package budgetWiseFinanceTracker;

//Transaction Class (Data Unit)
class Transaction {
	double amount;
	String type; // "Income" or "Expense"
	String category;
	String date;

	Transaction(double amount, String type, String category, String date) {
		this.amount = amount;
		this.type = type;
		this.category = category;
		this.date = date;
	}
}
