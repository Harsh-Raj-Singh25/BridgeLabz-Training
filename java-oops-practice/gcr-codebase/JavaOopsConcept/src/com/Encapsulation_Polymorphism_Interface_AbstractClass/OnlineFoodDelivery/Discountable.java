package com.Encapsulation_Polymorphism_Interface_AbstractClass.OnlineFoodDelivery;

//INTERFACE: Defines a contract for items that support price reductions
interface Discountable {
	double applyDiscount(double total);
	String getDiscountDetails();
}