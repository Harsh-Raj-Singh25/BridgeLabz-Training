package com.Encapsulation_Polymorphism_Interface_AbstractClass.BankingApplication;

//Interface for Loan services
interface Loanable {
	void applyForLoan(double amount);
	boolean calculateLoanEligibility();
}
