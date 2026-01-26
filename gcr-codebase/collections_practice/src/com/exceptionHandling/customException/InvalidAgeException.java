package com.exceptionHandling.customException;

import java.util.Scanner;

// Create the Custom Exception class
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		// Pass the error message to the parent Exception class
		super(message);
	}
}
