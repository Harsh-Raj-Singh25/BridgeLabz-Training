package com.Encapsulation_Polymorphism_Interface_AbstractClass.BankingApplication;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of BankAccounts (Polymorphism)
        List<BankAccount> accounts = new ArrayList<>();

        // Adding accounts to the system
        // Note: SavingsAccount is-a BankAccount
        accounts.add(new SavingsAccount("SAV-101", "Harsh Singh", 150000000.0));
        accounts.add(new SavingsAccount("SAV-102", "Namrata Khapre", 50000000.0));

        System.out.println("======= WELCOME TO THE BANKING SYSTEM =======");

        for (BankAccount acc : accounts) {
            System.out.println("\nProcessing Account for: " + acc.getBalance()); // Simple getter call
            
            // 1. Perform a deposit
            acc.deposit(2000.0);
            System.out.println("Deposited 2000. New Balance: " + acc.getBalance());

            // 2. Calculate Interest (Polymorphic call)
            acc.calculateInterest();

            // 3. Handle Loan Logic (Interface check)
            // We check if the account implements the Loanable interface
            if (acc instanceof Loanable) {
                Loanable loanAccount = (Loanable) acc; // Type Casting
                System.out.println("Checking loan eligibility...");
                
                if (loanAccount.calculateLoanEligibility()) {
                    loanAccount.applyForLoan(50000.0);
                } else {
                    System.out.println("Status: Not eligible for a loan at this time.");
                }
            }
            
            System.out.println("---------------------------------------------");
        }
    }
}
