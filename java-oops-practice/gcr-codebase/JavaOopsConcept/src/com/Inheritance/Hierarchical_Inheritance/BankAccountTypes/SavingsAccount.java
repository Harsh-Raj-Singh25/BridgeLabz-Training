package com.Inheritance.Hierarchical_Inheritance.BankAccountTypes;

//Subclass 1
class SavingsAccount extends BankAccount {
	double interestRate;

	SavingsAccount(String accNum, double bal, double interestRate) {
		super(accNum, bal);
		this.interestRate = interestRate;
	}

	void displayAccountType() {
		displayBaseInfo();
		System.out.println("Account Type: Savings | Interest Rate: " + interestRate + "%");
	}
}
