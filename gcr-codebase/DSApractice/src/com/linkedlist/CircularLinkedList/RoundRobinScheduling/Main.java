package com.linkedlist.CircularLinkedList.RoundRobinScheduling;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler cpu = new RoundRobinScheduler();

        // Process ID, Burst Time, Priority
        cpu.addProcess(1, 10, 1);
        cpu.addProcess(2, 5, 2);
        cpu.addProcess(3, 8, 1);

        // Run simulation with Time Quantum of 4
        cpu.simulate(4);
    }
}