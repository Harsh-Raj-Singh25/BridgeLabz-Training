package com.linkedlist.CircularLinkedList.RoundRobinScheduling;

class ProcessNode {
    int pid;
    int burstTime;        // Time required by the CPU
    int remainingTime;    // Time left to finish execution
    int priority;
    ProcessNode next;

    public ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
		this.next = null;
	}
}
