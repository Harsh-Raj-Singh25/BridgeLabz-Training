package com.day2.callCenter;

import java.util.*;

class CallCenter {

	Queue<Customer> normalQueue = new LinkedList<>();

	PriorityQueue<Customer> vipQueue = new PriorityQueue<>((a, b) -> a.name.compareTo(b.name) // simple priority logic
	);

	HashMap<String, Integer> callCount = new HashMap<>();

	void addCall(Customer customer) {

		// Update call count
		callCount.put(customer.id, callCount.getOrDefault(customer.id, 0) + 1);

		// Add to appropriate queue
		if (customer.isVIP) {
			vipQueue.offer(customer);
		} else {
			normalQueue.offer(customer);
		}

		System.out.println("Call added: " + customer.name);
	}
	// serving the customers according to priority:-
	void serveCall() {

		Customer customer;
		// serving priority customers first
		if (!vipQueue.isEmpty()) {
			customer = vipQueue.poll();
			System.out.println("Serving VIP customer: " + customer.name);
		} else if (!normalQueue.isEmpty()) {
			customer = normalQueue.poll();
			System.out.println("Serving normal customer: " + customer.name);
		} else {
			System.out.println("No calls in queue");
			return;
		}
	}
}
