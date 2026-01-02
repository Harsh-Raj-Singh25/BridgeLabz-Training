package com.Encapsulation_Polymorphism_Interface_AbstractClass.BankingApplication;

//Abstract Superclass
abstract class BankAccount {
	private String accountNumber;
	private String holderName;
	protected double balance; // Protected so subclasses can adjust it

	public BankAccount(String accNum, String name, double bal) {
		this.accountNumber = accNum;
		this.holderName = name;
		this.balance = bal;
	}

	// Concrete methods
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= balance)
			balance -= amount;
		else
			System.out.println("Insufficient funds!");
	}

	// Abstract method
	public abstract void calculateInterest();

	public double getBalance() {
		return balance;
	}
}

