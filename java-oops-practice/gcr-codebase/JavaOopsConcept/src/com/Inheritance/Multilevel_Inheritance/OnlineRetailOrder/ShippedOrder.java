package com.Inheritance.Multilevel_Inheritance.OnlineRetailOrder;

public class ShippedOrder extends Order {
	int trackingNumber;
	
	ShippedOrder(int orderId,int orderDate, int trackingNumber){
		super(orderId,orderDate);
		this.trackingNumber=trackingNumber;
	}
	
}
