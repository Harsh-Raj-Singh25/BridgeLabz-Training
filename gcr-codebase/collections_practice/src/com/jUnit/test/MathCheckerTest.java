package com.jUnit.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.jUnit.com.parameterizedTests.MathChecker;

import static org.junit.jupiter.api.Assertions.*;

public class MathCheckerTest {
	MathChecker checker = new MathChecker();

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 8, 10 })
	void testIsEvenWithTrueValues(int number) {
		assertTrue(checker.isEven(number), number + " should be even");
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 3, 5, 7, 9 })
	void testIsEvenWithFalseValues(int number) {
		assertFalse(checker.isEven(number), number + " should be odd");
	}
}
