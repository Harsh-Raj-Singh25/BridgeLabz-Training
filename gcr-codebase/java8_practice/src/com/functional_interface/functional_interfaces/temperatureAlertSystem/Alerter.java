package com.functional_interface.functional_interfaces.temperatureAlertSystem;

import java.util.Scanner;
import java.util.function.Predicate;

/*
 * ○ Scenario: Alert if temperature crosses threshold.
○ Task: Use Predicate<Double> functional interface.
 */
public class Alerter {
	public static void main(String[] args) {
		int threshold=45; // in degrees
		Predicate<Double> alerter=t -> t>threshold;
		
		System.out.println(" WELCOME TO TEMPERATURE ALERTER");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter current temperature :");
		double temp=sc.nextDouble();
		if(alerter.test(temp)) {
			System.out.println(" WARNING ");
			System.out.println(" Temperature is not suitable ");
			
		}else {
			System.out.println(" Be chill....");
			System.out.println(" Temperature is nice !!!");
		}
	}
}
