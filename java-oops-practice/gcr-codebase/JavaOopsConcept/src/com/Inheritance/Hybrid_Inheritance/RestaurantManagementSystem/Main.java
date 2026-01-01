package com.Inheritance.Hybrid_Inheritance.RestaurantManagementSystem;

public class Main {
	public static void main(String[] args) {
        Chef c1 = new Chef("Sanjiv", 501, "North Cuisine");
        Waiter w1 = new Waiter("Rajiv", 502, 5);

        System.out.println("--- Restaurant Duty Roster ---");
        c1.performDuties();
        w1.performDuties();
    }
}
