package com.objectModeling.level1.bankAccount;

public class Bank {
	public String bankName;
	
	
	Bank(String bankName){
		this.bankName=bankName;
	}
	
	public void openAccount(Customer customer) {
		System.out.println("\n--- Welcome to " + bankName + " ---");
        System.out.println("Processing account for: " + customer.getName());
        System.out.println("Status: Account opened successfully.");
    }

    // Communication: Bank modifies customer data
    public void deposit(Customer customer, double amount) {
        System.out.println("Depositing Rs. " + amount + " into " + customer.getName() + "'s account.");
	}
}
