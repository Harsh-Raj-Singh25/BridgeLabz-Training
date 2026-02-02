package com.functional_interface.static_methods.unitConversionTool;

public class ShippingApp {
	public static void main(String[] args) {
		double weightKg = 50.0;
		System.out.println("Weight in Lbs: " + LogisticsConverter.toLbs(weightKg));
	}
}