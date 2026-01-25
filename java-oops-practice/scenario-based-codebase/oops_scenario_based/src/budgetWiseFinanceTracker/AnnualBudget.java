package budgetWiseFinanceTracker;

//Inheritance: Annual Budget
class AnnualBudget extends Budget implements IAnalyzable {
	private int year;

	public AnnualBudget(double annualIncome, int year) {
		super(annualIncome);
		this.year = year;
	}

	@Override
	public void detectOverspend() {
		// Annual overspend might look at the total yearly limit
		if (calculateNetSavings() < 0) {
			System.out.println(" Critical: Annual expenses exceeded annual income!");
		}
	}

	@Override
	public void generateReport() {
		System.out.println(" --- ANNUAL FINANCIAL STATEMENT: " + year + " ---");
		System.out.println("Total Yearly Income: Rs." + income);
		System.out.println("Total Remaining: Rs." + calculateNetSavings());
		System.out.println("Yearly Average Savings/Month: Rs." + (calculateNetSavings() / 12));
	}
}
