package com.collectors.orderRevenue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
 * 3. Order Revenue Summary
○ Scenario: Sum order totals per customer.
○ Task: Use Collectors.summingDouble()
 */
public class RevenueSummary {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
	            new Order("Amazon", 500.0),
	            new Order("Flipkart", 300.0),
	            new Order("Amazon", 200.0),
	            new Order("Flipkart", 150.0)
	        );
		Map<String , Double> revenue = orders.stream().collect(Collectors.groupingBy(Order:: getCustomer, Collectors.summingDouble(Order::getAmount )));
		System.out.println(revenue);
		// using for each 
		revenue.forEach((customer,amount)-> System.out.println(customer + " total revenue= Rs."+ amount));
		
		
	}
}
