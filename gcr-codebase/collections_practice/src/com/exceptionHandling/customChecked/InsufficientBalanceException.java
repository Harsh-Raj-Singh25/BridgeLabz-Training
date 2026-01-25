package com.exceptionHandling.customChecked;

import java.util.Scanner;

//1. Custom Checked Exception for Business Logic
@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

