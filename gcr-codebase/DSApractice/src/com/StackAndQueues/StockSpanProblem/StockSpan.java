package com.StackAndQueues.StockSpanProblem;

import java.util.Stack;
import java.util.Arrays;

public class StockSpan {

	public static int[] calculateSpan(int[] prices) {
		int n = prices.length;
		int[] span = new int[n];

		// Stack will store indices of the prices
		Stack<Integer> stack = new Stack<>();

		// Process each day's price
		for (int i = 0; i < n; i++) {
			// Pop elements from stack while stack is not empty and
			// the price at the top of the stack is less than or equal to current price
			while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
				stack.pop();
			}

			//  If stack is empty, it means current price is greater than all previous
			// prices
			// Otherwise, the span is the difference between current index and the index
			// of the nearest greater element on the left
			if (stack.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - stack.peek();
			}

			//  Push the current index onto the stack
			stack.push(i);
		}

		return span;
	}
}
