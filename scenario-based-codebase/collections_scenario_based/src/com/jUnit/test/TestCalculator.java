package collections_scenario_based.logicalQues.jUnit;
package com.jUnit.test;

import collections_scenario_based.logicalQues.jUnit.Calculator;

public class TestCalculator {
	Calculator calc;
	
	@BeforeEach
	public void setup() {
		calc=new Calculator();
	}
	@Test
	public void testAddition() {
		assertEquals(10,calc.addition(5, 5));
	}
}
