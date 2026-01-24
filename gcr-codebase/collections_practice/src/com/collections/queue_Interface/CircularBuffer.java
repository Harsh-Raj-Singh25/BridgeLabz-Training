package com.collections.queue_Interface;
/*
Circular Buffer Simulation
Implement a circular buffer (fixed-size queue) using an array-based queue. When full, overwrite the oldest element.
Example:
Buffer size=3: Insert 1, 2, 3 → Insert 4 → Buffer: [2, 3, 4].
 */
public class CircularBuffer {
    private final int[] buffer;
    private int head = 0;   // Points to the oldest element (to be read/removed)
    private int tail = 0;   // Points to the next empty slot (to be written)
    private int size = 0;   // Tracks current number of elements
    private final int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
    }

    // 🔹 Scenario: Insert/Overwrite Logic
    public void insert(int value) {
        if (size == capacity) {
            // Buffer is full: we are about to overwrite the data at 'head'
            // So, we move 'head' forward to the next oldest element
            head = (head + 1) % capacity;
        } else {
            size++;
        }

        buffer[tail] = value;
        // Wrap-around the tail using modulo
        tail = (tail + 1) % capacity;
    }

    // 🔹 Scenario: Remove/Read Logic (FIFO)
    public Integer delete() {
        if (size == 0) {
            System.out.println("Buffer is empty!");
            return null;
        }

        int value = buffer[head];
        head = (head + 1) % capacity;
        size--;
        return value;
    }

    // 🔹 Display the buffer in the correct logical order
    public void display() {
        if (size == 0) {
            System.out.println("Buffer: []");
            return;
        }

        System.out.print("Buffer: [ ");
        for (int i = 0; i < size; i++) {
            // Calculate the index relative to 'head'
            int index = (head + i) % capacity;
            System.out.print(buffer[index] + (i < size - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        System.out.println("--- Inserting 1, 2, 3 ---");
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display(); // Buffer: [ 1, 2, 3 ]

        System.out.println("\n--- Inserting 4 (Overwrites 1) ---");
        cb.insert(4);
        cb.display(); // Buffer: [ 2, 3, 4 ]

        System.out.println("\n--- Deleting oldest (2) ---");
        cb.delete();
        cb.display(); // Buffer: [ 3, 4 ]
        
        System.out.println("\n--- Inserting 5, 6 (Overwrites 3) ---");
        cb.insert(5);
        cb.insert(6);
        cb.display(); // Buffer: [ 4, 5, 6 ]
    }
}