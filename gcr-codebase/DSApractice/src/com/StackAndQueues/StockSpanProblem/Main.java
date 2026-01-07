package com.StackAndQueues.StockSpanProblem;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] prices = { 100, 80, 60, 70, 60, 75, 85 };

		System.out.println("Stock Prices: " + Arrays.toString(prices));

		int[] result = StockSpan.calculateSpan(prices);
		System.out.println("Stock Spans:   " + Arrays.toString(result));
	}
}
