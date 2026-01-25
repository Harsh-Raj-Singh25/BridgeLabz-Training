package budgetWiseFinanceTracker;
/*
 * 23. "BudgetWise – Personal Finance Tracker"
Story: BudgetWise helps users plan monthly budgets and track income/expenses across
categories.
Requirements:
● Transaction class: amount, type, date, category.
● Budget class: income, limit, categoryLimits[].
● Interface IAnalyzable with generateReport() and detectOverspend().
● Constructors for monthly budgets with custom categories.
● Use operators to calculate net savings: income - totalExpenses.
● Encapsulation: restrict direct expense editing.
● Inheritance: MonthlyBudget, AnnualBudget.
● Polymorphism: report format varies (monthly vs yearly).
 */
//Main Execution
public class BudgetWiseApp {
	public static void main(String[] args) {
		// Scenario 1: Monthly Tracking
		MonthlyBudget febBudget = new MonthlyBudget(5000, "February");
		febBudget.setCategoryLimit("Food", 500);
		febBudget.setCategoryLimit("Entertainment", 200);

		febBudget.addTransaction(600, "Expense", "Food", "2026-02-10");
		febBudget.addTransaction(150, "Expense", "Entertainment", "2026-02-15");

		// Scenario 2: Polymorphism in Action
		IAnalyzable[] myFinances = { febBudget, new AnnualBudget(60000, 2026) };

		for (IAnalyzable analysis : myFinances) {
			analysis.generateReport();
			analysis.detectOverspend();
			System.out.println();
		}
	}
}