package com.annotations.custom.advanced.cachingSystem;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CachingSystem {
	private static final Map<String, Integer> cache = new HashMap<>();

	public static void main(String[] args) throws Exception {
		CalculatorService service = new CalculatorService();

		System.out.println("Result 1: " + getResult(service, 5));
		System.out.println("Result 2: " + getResult(service, 5)); // Should be instant
		System.out.println("Result 3: " + getResult(service, 10));
	}

	public static int getResult(Object obj, int input) throws Exception {
		Method m = obj.getClass().getMethod("expensiveCalculation", int.class);
		String key = m.getName() + ":" + input;

		if (m.isAnnotationPresent(CacheResult.class) && cache.containsKey(key)) {
			System.out.print("[CACHE HIT] ");
			return cache.get(key);
		}

		int result = (int) m.invoke(obj, input);
		cache.put(key, result);
		return result;
	}
}