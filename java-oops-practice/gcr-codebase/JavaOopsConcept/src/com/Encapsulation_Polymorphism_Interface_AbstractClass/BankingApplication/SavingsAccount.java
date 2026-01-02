package com.Encapsulation_Polymorphism_Interface_AbstractClass.BankingApplication;

class SavingsAccount extends BankAccount implements Loanable {
	public SavingsAccount(String accNum, String name, double bal) {
		super(accNum, name, bal);
	}
	// overriding class methods
	@Override
	public void calculateInterest() {
		double interest = balance * 0.04; // 4% interest
		balance += interest;
		System.out.println("Savings Interest added: " + interest);
	}
	
	
	// Interface methods implementation & overriding
	@Override
	public boolean calculateLoanEligibility() {
		return balance > 10000;
	}

	@Override
	public void applyForLoan(double amount) {
		if (calculateLoanEligibility())
			System.out.println("Loan of " + amount + " approved.");
	}
}