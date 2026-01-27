package com.jUnit.test;

import org.junit.jupiter.api.*;

import com.jUnit.com.advance_problems.userRegistration.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;
public class UserRegistrationTest {
	UserRegistration registration = new UserRegistration();

	@Test
	void testSuccessfulRegistration() {
		assertTrue(registration.registerUser("Gemini", "ai@google.com", "secret123"));
	}

	@Test
	void testInvalidInputs() {
		// assertAll allows us to group multiple assertions
		// If one fails, the others will still be checked
		assertAll("Registration Failures", () -> assertThrows(IllegalArgumentException.class,
				() -> registration.registerUser("Harsh", "harsh@mail.com", "pass123"), "Should fail for short username"),

				() -> assertThrows(IllegalArgumentException.class,
						() -> registration.registerUser("User1", "invalid-email", "pass123"),
						"Should fail for bad email"),

				() -> assertThrows(IllegalArgumentException.class,
						() -> registration.registerUser("User1", "test@mail.com", "123"),
						"Should fail for short password"));
	}
}