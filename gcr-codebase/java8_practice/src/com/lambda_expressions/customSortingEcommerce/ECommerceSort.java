package com.lambda_expressions.customSortingEcommerce;

import java.util.Arrays;
import java.util.List;

/*
 * Custom Sorting in E-Commerce
○ Scenario: An online shop wants to sort products differently based on sales
campaigns (by price, rating, discount).
○ Task: Use a lambda with Comparator to sort products dynamically.
 */
public class ECommerceSort {
	public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 999.99, 4.5),
            new Product("Phone", 499.50, 4.8),
            new Product("Headphones", 150.00, 4.2)
        );

        System.out.println("--- Sorting by Price (Low to High) ---");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\n--- Sorting by Rating (High to Low) ---");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);
    }
}
