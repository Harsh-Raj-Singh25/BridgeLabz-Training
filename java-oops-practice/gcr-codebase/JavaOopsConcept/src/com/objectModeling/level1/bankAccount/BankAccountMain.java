package com.objectModeling.level1.bankAccount;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank hdfc = new Bank("HDFC Bank");
        Customer customer1 = new Customer("Harsh Singh", 5000.0);

        // Step 2: Establish association through communication
        // The Bank object acts upon the Customer object
        hdfc.openAccount(customer1);

        // Step 3: Customer performs an action independently
        customer1.viewBalance();

        // Step 4: Another communication example
        hdfc.deposit(customer1, 2000.0);
	}

}
