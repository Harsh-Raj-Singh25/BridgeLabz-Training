package com.day9_BST.e_commerceInventory;

public class Product {
	String SKU;
	String name;
	double price;
	Product left, right;
	
	Product(String SKU, String name, double price){
		this.name=name;
		this.SKU=SKU;
		this.price=price;
		left=right=null;
	}
	
	
}
