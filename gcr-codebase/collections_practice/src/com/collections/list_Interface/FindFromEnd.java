package com.collections.list_Interface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Find the Nth Element from the End
Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
Example:
Input: [A, B, C, D, E], N=2 → Output: D.

 */
class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class FindFromEnd {
    public static Node findNth(Node head, int n) {
        Node fast = head;
        Node slow = head;

        //   Move fast pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) return null; // N is larger than list size
            fast = fast.next;
        }

        //  Move both together
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow; // Slow is now at the Nth element from end
    }
    
    public static void main(String[] args) {
        //  Create individual nodes
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');

        //  Link them manually: A -> B -> C -> D -> E -> null
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //  Set N (e.g., find 2nd from the end)
        int n = 2;
        
        //  Call the method
        Node result = findNth(a, n);

        //  Output the result
        if (result != null) {
            System.out.println("The " + n + "nd element from the end is: " + result.data);
        } else {
            System.out.println("Invalid N value or list is too short.");
        }
    }

}
