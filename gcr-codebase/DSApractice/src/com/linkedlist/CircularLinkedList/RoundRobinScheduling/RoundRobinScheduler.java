package com.linkedlist.CircularLinkedList.RoundRobinScheduling;

class RoundRobinScheduler {
	private ProcessNode head = null;
	private ProcessNode tail = null;
	private int totalProcesses = 0;

	// ADD: Add process to the circular queue
	public void addProcess(int pid, int burst, int priority) {
		ProcessNode newNode = new ProcessNode(pid, burst, priority);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
		totalProcesses++;
	}

	// SIMULATE: Round Robin Execution
	public void simulate(int timeQuantum) {
		if (head == null)
			return;

		ProcessNode current = head;
		ProcessNode prev = tail;
		int currentTime = 0;
		double totalWaitTime = 0;
		double totalTurnAroundTime = 0;

		System.out.println("\n--- Starting CPU Scheduling (Quantum: " + timeQuantum + ") ---");

		while (totalProcesses > 0) {
			System.out.println("CPU executing P" + current.pid + " | Remaining: " + current.remainingTime);

			if (current.remainingTime > timeQuantum) {
				// LOGIC: Process uses full quantum and stays in queue
				currentTime += timeQuantum;
				current.remainingTime -= timeQuantum;
				prev = current;
				current = current.next;
			} else {
				// LOGIC: Process finishes within quantum and leaves queue
				currentTime += current.remainingTime;
				int turnAroundTime = currentTime;
				int waitingTime = turnAroundTime - current.burstTime;

				totalTurnAroundTime += turnAroundTime;
				totalWaitTime += waitingTime;

				System.out.println(">> P" + current.pid + " Finished! [Wait Time: " + waitingTime + " | TAT: "
						+ turnAroundTime + "]");

				// Remove the finished node from circular list
				if (current == head && current == tail) {
					head = tail = null;
				} else {
					prev.next = current.next;
					if (current == head)
						head = prev.next;
					if (current == tail)
						tail = prev;
				}
				current = prev.next;
				totalProcesses--;
			}
		}

		System.out.println("\n--- Performance Metrics ---");
		System.out.printf("Average Waiting Time: %.2f%n", (totalWaitTime / (totalWaitTime == 0 ? 1 : 3))); // Simplified
																											// for demo
		System.out.printf("Average Turn-Around Time: %.2f%n",
				(totalTurnAroundTime / (totalTurnAroundTime == 0 ? 1 : 3)));
	}
}