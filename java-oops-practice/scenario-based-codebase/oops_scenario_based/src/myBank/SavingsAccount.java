package myBank;

//INHERITANCE: Savings Account specializing the base Account
class SavingsAccount extends Account {
	private double interestRate = 4.5; // 4.5% interest

	public SavingsAccount(String accNum, double initial) {
		super(accNum, initial);
	}

	// POLYMORPHISM: Interest calculation specific to Savings
	@Override
	public void calculateInterest() {
		// OPERATORS: balance * interestRate / 100
		double interest = getBalance() * interestRate / 100;
		deposit(interest); // Adding interest to balance
		System.out.println("Annual Interest of Rs. " + interest + " applied to Savings Account.");
	}
}
