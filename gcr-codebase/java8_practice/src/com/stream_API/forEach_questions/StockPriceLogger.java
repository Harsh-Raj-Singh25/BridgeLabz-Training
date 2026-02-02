package com.stream_API.forEach_questions;

import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {
	public static void main(String[] args) {
		List<Double> prices=Arrays.asList(150.2, 154.35, 160.45, 157.22, 158.2 , 145.38, 159.58);
		
//		List<Double> prices = Arrays.asList(150.25, 152.10, 149.80, 155.00);

		// Using Method Reference for clean logging
		//stockPrices.forEach(System.out::println);
		System.out.println("Stock prices today [lower to higher ] ");
		prices.stream().sorted().forEach(System.out::println);
	}
}
