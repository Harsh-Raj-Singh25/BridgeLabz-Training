package com.lambda.basic_tasks;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class BasicTasks {
	public static void main(String[] args) {
		// 1. Run task in a separate thread
		// Runnable is a functional interface with the run() method
		new Thread(() -> System.out.println("Thread is running...")).start();

		// 2. Print numbers from a list
		List<Integer> nums = Arrays.asList(10, 15, 20, 25);
		nums.forEach(System.out::println);

		// 3. Even or Odd
		Predicate<Integer> isEven = n -> n % 2 == 0;
		System.out.println("Is 15 even? " + isEven.test(15));

		// 4. Add two numbers
		BinaryOperator<Integer> adder = (a, b) -> a + b;
		System.out.println("Sum: " + adder.apply(5, 10));

		// 5. Greater of two numbers
		BinaryOperator<Integer> maxFinder = (a, b) -> a > b ? a : b;
		System.out.println("Greater: " + maxFinder.apply(50, 30));
	}
}