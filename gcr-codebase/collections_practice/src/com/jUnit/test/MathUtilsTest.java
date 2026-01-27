package com.jUnit.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.jUnit.com.exceptionHandling.*;

public class MathUtilsTest {
	@Test
	void testDivideByZeroThrowsException() {
		MathUtils math = new MathUtils();

		// Verifies that the exception is thrown and captures it
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
			math.divide(10, 0);
		});

		// Optional: Verify the specific error message
		assertEquals("Division by zero", exception.getMessage());
	}
}