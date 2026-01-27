package com.jUnit.advance_problems.passwordStrengthValidator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
	PasswordValidator validator = new PasswordValidator();
	
	
	// pass case
	@ParameterizedTest
	@ValueSource(strings = { "ValidPass123", "StrongP@ssw0rd", "JavaTest99" })
	void testValidPasswords(String password) {
		assertTrue(validator.isValid(password));
	}
	
	// fail case
	@ParameterizedTest
	@ValueSource(strings = { "short", "NoDigitHere", "alllowercase123", "12345678" })
	void testInvalidPasswords(String password) {
		assertTrue(validator.isValid(password)); // if we use assertFalse , it will pass
	}
}