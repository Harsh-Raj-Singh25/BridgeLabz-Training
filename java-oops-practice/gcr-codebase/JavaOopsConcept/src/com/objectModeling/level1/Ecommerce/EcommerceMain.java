package com.objectModeling.level1.Ecommerce;

public class EcommerceMain {
    public static void main(String[] args) {
    	// create a new customer
        Customer ram = new Customer("Ram");

        Product mobile = new Product("Mobile", 15000);
        Product earbuds = new Product("Earbuds", 2000);
        // using method from Customer to place order
        Order order1 = ram.placeOrder(101);
        // adding the products
        order1.addProduct(mobile);
        order1.addProduct(earbuds);
        // final order output
        order1.showOrderDetails();
    }
}
