package com.jUnit.com.advance_problems.userRegistration;

public class UserRegistration {
	public boolean registerUser(String username, String email, String password) {
		if (username == null || username.length() < 3) {
			throw new IllegalArgumentException("Username too short");
		}
		if (email == null || !email.contains("@")) {
			throw new IllegalArgumentException("Invalid email");
		}
		if (password == null || password.length() < 6) {
			throw new IllegalArgumentException("Password too weak");
		}
		return true; // Registration successful
	}
}