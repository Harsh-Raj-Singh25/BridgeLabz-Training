package com.Inheritance.Hierarchical_Inheritance.BankAccountTypes;

//Subclass 3
class FixedDepositAccount extends BankAccount {
	int lockInPeriod; // in months

	FixedDepositAccount(String accNum, double bal, int months) {
		super(accNum, bal);
		this.lockInPeriod = months;
	}

	void displayAccountType() {
		displayBaseInfo();
		System.out.println("Account Type: Fixed Deposit | Lock-in: " + lockInPeriod + " months");
	}
}
