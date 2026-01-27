package com.jUnit.advance_problems.bankingTransactions;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
	private BankAccount account;
	
	@BeforeEach
	void setup() {
		account = new BankAccount();
	}

	@Test
	void testDeposit() {
		account.deposit(100.0);
		assertEquals(100.0, account.getBalance());
	}

	@Test
	void testWithdrawInsufficientFunds() {
		account.deposit(50.0);
		assertThrows(IllegalArgumentException.class, () -> account.withdraw(100.0));
	}
	
	@AfterEach
	void message() {
		System.out.println(" Transaction Complete !!!!");
	}
}
