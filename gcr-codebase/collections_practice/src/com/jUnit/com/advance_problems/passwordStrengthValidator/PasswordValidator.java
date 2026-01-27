package com.jUnit.com.advance_problems.passwordStrengthValidator;

public class PasswordValidator {
	public boolean isValid(String password) {
		if (password == null || password.length() < 8)
			return false;

		boolean hasUpper = password.chars().anyMatch(Character::isUpperCase);
		boolean hasDigit = password.chars().anyMatch(Character::isDigit);

		return hasUpper && hasDigit;
	}
}