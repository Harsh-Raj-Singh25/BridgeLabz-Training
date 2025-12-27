package com.constructor.level1;

public class Product {
	String productName;
	int price;
	// class variable
	static int totalProducts=0;
	
	// parameterized constructor
	Product(String productName, int price){
		this.productName=productName;
		this.price=price;
		totalProducts++;
	}
	
	// instance method
	void displayProductDetails() {
		System.out.println("The product Name is: "+ productName);
		System.out.println("The price is : "+ price);
	}
	// class method
	 static void  displayTotalProducts() {
		System.out.println(" the total products is : "+ totalProducts);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product("Laptop", 75000);
        Product product2 = new Product("Smartphone", 25000);

        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts(); 
		
	}

}
