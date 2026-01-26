package com.jUnit.testCalculator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void testOperations() {
        assertAll("Basic Math",
            () -> assertEquals(10, calc.add(7, 3)),
            () -> assertEquals(4, calc.subtract(7, 3)),
            () -> assertEquals(21, calc.multiply(7, 3)),
            () -> assertEquals(2.5, calc.divide(5, 2))
        );
    }

    @Test
    @DisplayName("Division by zero should throw ArithmeticException")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
