package com.Inheritance.Hierarchical_Inheritance.BankAccountTypes;

//Subclass 2
class CheckingAccount extends BankAccount {
	double withdrawalLimit;

	CheckingAccount(String accNum, double bal, double limit) {
		super(accNum, bal);
		this.withdrawalLimit = limit;
	}

	void displayAccountType() {
		displayBaseInfo();
		System.out.println("Account Type: Checking | Daily Limit: Rs. " + withdrawalLimit);
	}
}