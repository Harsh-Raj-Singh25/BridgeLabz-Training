package com.collections.queue_Interface;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/*
 * Reverse a Queue
Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).
Example:
Input: [10, 20, 30] → Output: [30, 20, 10].

 */
public class reverseQueue {
	public static void reverse(Queue<Integer> numbers) {
		Stack<Integer> stack = new Stack<>();

		// Dequeue everything and push to Stack
		while (!numbers.isEmpty()) {
			stack.push(numbers.poll());
		}

		//   Pop everything from Stack and Enqueue back
		while (!stack.isEmpty()) {
			numbers.offer(stack.pop());
		}

		System.out.println("Reversed queue: " + numbers);
	}

	public static void main(String[] args) {
		Queue<Integer> numbers = new LinkedList<>();
		numbers.offer(15);
		numbers.add(14);
		numbers.add(13);
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12));

		numbers.addAll(list);

		System.out.println("Original queue:" + numbers);
		reverse(numbers);
	}
}
