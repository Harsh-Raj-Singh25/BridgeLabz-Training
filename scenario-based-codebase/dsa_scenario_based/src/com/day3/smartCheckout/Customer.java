package com.day3.smartCheckout;

import java.util.*;

class Customer {
	String name;
	List<String> shoppingCart;

	Customer(String name, List<String> items) {
		this.name = name;
		this.shoppingCart = items;
	}
}
