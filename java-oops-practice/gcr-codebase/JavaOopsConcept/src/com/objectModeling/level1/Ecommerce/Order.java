package com.objectModeling.level1.Ecommerce;

import java.util.*;
public class Order {
    int orderId;
    List<Product> products;
    // constructor
    Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }
    // method to add product
    void addProduct(Product product) {
        products.add(product);
    }
    // method to show orders
    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println(" Product: " + p.productName + " ₹" + p.price);
        }
    }
}