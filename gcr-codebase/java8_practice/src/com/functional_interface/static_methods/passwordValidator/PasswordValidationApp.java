package com.functional_interface.static_methods.passwordValidator;

import java.util.Scanner;

public class PasswordValidationApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you password");
		System.out.println("The password must have 1 digit, 1 uppercase, 1 symbol, and 1 lowercase letter and atleat 7 letters ");
		String pass=sc.next();
		// calling the static method from interface and validating password
		if(SecurityUtils.checkPassword(pass)) {
			System.out.println("Your password is Strong");
		}else {
			System.out.println(" Password is weak.");
			System.out.println(" Enter again ");
		}
	}
}
