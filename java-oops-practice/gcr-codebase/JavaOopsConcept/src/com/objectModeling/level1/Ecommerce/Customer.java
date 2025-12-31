package com.objectModeling.level1.Ecommerce;

class Customer {
    String customerName;

    Customer(String customerName) {
        this.customerName = customerName;
    }

    Order placeOrder(int orderId) {
        System.out.println(customerName + " placed order " + orderId);
        return new Order(orderId);
    }
}
