package com.Inheritance.Hierarchical_Inheritance.BankAccountTypes;

public class Main {
	public static void main(String[] args) {
		// making objects
        SavingsAccount sa = new SavingsAccount("SAV123", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("CHK456", 20000, 10000);
        
        // using methods
        sa.displayAccountType();
        System.out.println("----------------------------------------------");
        ca.displayAccountType();
    }
}
