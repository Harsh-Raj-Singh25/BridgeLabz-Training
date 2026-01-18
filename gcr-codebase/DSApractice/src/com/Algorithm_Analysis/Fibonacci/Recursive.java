package com.Algorithm_Analysis.Fibonacci;

public class Recursive {
	public static int compute(int number) {
		if (number <= 1) {
			return number;
		}
		return compute(number - 1) + compute(number - 2);
	}
}
