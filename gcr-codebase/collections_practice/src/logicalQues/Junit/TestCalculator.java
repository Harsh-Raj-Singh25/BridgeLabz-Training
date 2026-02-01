package logicalQues.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestCalculator {
	Calculator calc;
	@BeforeEach
	public void setup() { 
		calc=new Calculator();
		System.out.println("--- The test started -----");
	}
	
	@Test
	public void testAddition() {
		assertEquals(10, calc.addition(5, 5));
		
	}
	@ParameterizedTest
	@ValueSource(ints= {1,2,3,4,5,6})
	public void test(int value) {
		assertTrue(calc.isEven(value));
	}
	
	
	@Test
	public void testSubtraction() {
		assertEquals(5,calc.subtraction(15, 10));
	}
	
	@Test
	public void testDivision() {
		int a=10;
		int b=5;
		assertEquals(4,calc.division(a, b));
		
	}
	@Test
    @DisplayName("Division by zero should throw ArithmeticException")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.division(10, 0));
    }
	@AfterEach
	public void terminate() {
		System.out.println("The operation completed");
		System.out.println("-- Test ended -----");
		System.out.println("-------------------");
	}
}
