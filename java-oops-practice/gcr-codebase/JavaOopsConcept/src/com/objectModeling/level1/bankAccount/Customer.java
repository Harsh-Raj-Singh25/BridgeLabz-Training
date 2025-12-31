package com.objectModeling.level1.bankAccount;

public class Customer {
	private String customerName;
	private double balance;
	
	Customer(String customerName,double balance){
		this.customerName=customerName;
		this.balance=balance;
	}
	
	public String getName() {
		return customerName;
	}
	
	public void viewBalance() {
		System.out.println("The current balance is:"+balance);
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
}
