package com.reflection.intermediate_level.dynamicMethodInvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
	public void add(int a, int b) {
		System.out.println("Result: " + (a + b));
	}

	public void subtract(int a, int b) {
		System.out.println("Result: " + (a - b));
	}

	public void multiply(int a, int b) {
		System.out.println("Result: " + (a * b));
	}
}
