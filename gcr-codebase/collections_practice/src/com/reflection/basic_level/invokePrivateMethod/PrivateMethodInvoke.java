package com.reflection.basic_level.invokePrivateMethod;

import java.lang.reflect.Method;

public class PrivateMethodInvoke {
	public static void main(String[] args) throws Exception {
		Calculator calc = new Calculator();
		Class<?> clazz = calc.getClass();

		//  Get method by name and parameter types
		Method method = clazz.getDeclaredMethod("multiply", int.class, int.class);

		//  Bypass access check
		method.setAccessible(true);

		//   Invoke: (object instance, arguments...)
		int result = (int) method.invoke(calc, 10, 5);
		System.out.println("Multiply Result: " + result);
	}
}