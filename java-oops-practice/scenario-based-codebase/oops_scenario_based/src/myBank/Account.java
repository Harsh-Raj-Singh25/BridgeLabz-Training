package myBank;

//BASE CLASS: Represents a general bank account
abstract class Account implements ITransaction {
	private String accountNumber;
	// ENCAPSULATION: Balance is private. It cannot be accessed or modified directly
	// from outside.
	private double balance;

	// CONSTRUCTOR: Account with an opening balance
	public Account(String accountNumber, double openingBalance) {
		this.accountNumber = accountNumber;
		this.balance = openingBalance;
	}

	// OVERLOADED CONSTRUCTOR: Account with zero opening balance
	public Account(String accountNumber) {
		this(accountNumber, 0.0);
	}

	// ENCAPSULATION: Getters and protected methods to control data flow
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	// Logic to update balance (Used only by internal methods)
	protected void updateBalance(double newBalance) {
		this.balance = newBalance;
	}

	// ABSTRACT METHOD: Every account type calculates interest differently
	public abstract void calculateInterest();

	// INTERFACE IMPLEMENTATION: Standard Deposit
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Rs. " + amount + " deposited successfully.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	// INTERFACE IMPLEMENTATION: Standard Withdrawal with security check
	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Rs. " + amount + " withdrawn successfully.");
		} else {
			System.out.println("Insufficient funds or invalid amount.");
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Account [" + accountNumber + "] Current Balance: Rs. " + balance);
	}
}
