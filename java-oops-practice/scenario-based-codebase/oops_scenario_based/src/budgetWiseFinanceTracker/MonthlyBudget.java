package budgetWiseFinanceTracker;

import java.util.HashMap;
import java.util.Map;

//Inheritance: Monthly Budget
class MonthlyBudget extends Budget implements IAnalyzable {
	private String month;

	public MonthlyBudget(double income, String month) {
		super(income);
		this.month = month;
	}

	public void setCategoryLimit(String category, double limit) {
		categoryLimits.put(category, limit);
	}

	@Override
	public void detectOverspend() {
		Map<String, Double> spentPerCategory = new HashMap<>();
		for (Transaction t : transactions) {
			if (t.type.equalsIgnoreCase("Expense")) {
				spentPerCategory.put(t.category, spentPerCategory.getOrDefault(t.category, 0.0) + t.amount);
			}
		}

		System.out.println("--- Overspend Check (" + month + ") ---");
		spentPerCategory.forEach((cat, spent) -> {
			if (categoryLimits.containsKey(cat) && spent > categoryLimits.get(cat)) {
				System.out.println(" ALERT: Overspent in " + cat + "! (Limit: " + categoryLimits.get(cat)
						+ ", Spent: " + spent + ")");
			}
		});
	}

	@Override
	public void generateReport() {
		System.out.println(" Monthly Report for " + month);
		System.out.println("Income: Rs." + income);
		System.out.println("Net Savings: Rs." + calculateNetSavings());
	}
}
