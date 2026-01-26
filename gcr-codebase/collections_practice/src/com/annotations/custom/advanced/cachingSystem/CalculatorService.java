package com.annotations.custom.advanced.cachingSystem;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}

class CalculatorService {
	@CacheResult
	public int expensiveCalculation(int input) {
		System.out.println(" Performing heavy calculation for: " + input);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		} // Simulating delay
		return input * input;
	}
}
