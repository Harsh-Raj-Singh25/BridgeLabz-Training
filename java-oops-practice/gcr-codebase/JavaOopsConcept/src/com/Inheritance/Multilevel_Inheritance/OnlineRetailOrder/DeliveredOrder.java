package com.Inheritance.Multilevel_Inheritance.OnlineRetailOrder;

public class DeliveredOrder extends ShippedOrder{
	int deliveryDate;
	DeliveredOrder(int orderId,int orderDate,int trackingNumber, int deliveryDate){
		super(orderId,orderDate,trackingNumber);
		this.deliveryDate=deliveryDate;
	}
	void getOrderStatus() {
		System.out.println("The order:"+orderId+" and trackingNumber: "+trackingNumber+" is Delivered on "+deliveryDate);
	}
}
