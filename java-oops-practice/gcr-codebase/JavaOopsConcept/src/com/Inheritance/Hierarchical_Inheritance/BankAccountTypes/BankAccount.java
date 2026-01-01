package com.Inheritance.Hierarchical_Inheritance.BankAccountTypes;

//Superclass
class BankAccount {
	String accountNumber;
	double balance;
	// base constructor
	BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
     	this.balance = balance;
	}
	// method
	void displayBaseInfo() {
		System.out.println("A/C No: " + accountNumber + " | Balance: Rs. " + balance);
	}
}
