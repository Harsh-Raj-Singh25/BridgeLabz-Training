package com.StackAndQueues.QueueUsingStack;

import java.util.Stack;

class QueueUsingStacks {

    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    void enqueue(int x) {
        inStack.push(x);
    }

    int dequeue() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }

        if (outStack.isEmpty()) {
            System.out.println("Queue is empty");
        }

        return outStack.pop();
    }
}
