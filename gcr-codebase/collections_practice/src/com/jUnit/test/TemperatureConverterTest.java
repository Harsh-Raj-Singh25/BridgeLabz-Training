package com.jUnit.test;
import com.jUnit.com.advance_problems.temperatureConverter.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
	TemperatureConverter converter = new TemperatureConverter();

	@Test
	void testConversions() {
		// We use a delta of 0.001 to handle floating point precision
		assertEquals(212.0, converter.celsiusToFahrenheit(100.0), 0.001);
		assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.001);
		assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.001);
	}
}