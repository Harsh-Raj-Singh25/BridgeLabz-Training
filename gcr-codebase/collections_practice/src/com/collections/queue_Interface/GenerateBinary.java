package com.collections.queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {
    public static void generateBinary(int n) {
        // Create an empty queue of Strings
        Queue<String> q = new LinkedList<>();
        
        // Enqueue the first binary number
        q.add("1");
        
        // Loop to generate and print n binary numbers
        for (int i = 1; i <= n; i++) {
            // Remove the front element
            String s1 = q.remove();
            System.out.println(s1);
            
            // Generate next two binary numbers by appending '0' and '1'
            String s2 = s1; // Save current for the next append
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generateBinary(n);
    }
}

