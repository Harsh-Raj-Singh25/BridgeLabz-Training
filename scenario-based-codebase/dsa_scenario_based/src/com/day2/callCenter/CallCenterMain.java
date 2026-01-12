package com.day2.callCenter;

import java.util.Scanner;

public class CallCenterMain {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        CallCenter center = new CallCenter();
        
        System.out.println("WELCOME TO THE BHOPAL CALL CENTER");
        System.out.println("Enter the number of customers:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
        	System.out.println("Enter the id");
        	String id=sc.nextLine();
        	System.out.println("Enter your customer name:");
        	String name=sc.nextLine();
        	System.out.println("Is the customer VIP [true/false]");
        	boolean vip=sc.nextBoolean();
        	sc.nextLine();
        	center.addCall(new Customer(id,name, vip));
        }
        for(int i=0;i<n;i++) {
        	center.serveCall();
        }
        System.out.println("Call Frequency: " + center.callCount);
    }
}

