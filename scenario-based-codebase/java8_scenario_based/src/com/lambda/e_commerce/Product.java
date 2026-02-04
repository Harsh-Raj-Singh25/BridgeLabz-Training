package com.lambda.e_commerce;

import java.util.*;
import java.util.function.*;

class Product {
	String name;
	double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ": $" + price;
	}
}

