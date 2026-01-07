package com.StackAndQueues.sortStackRecursion;

import java.util.Stack;

class Main{
    public static void main(String[] args) {
    	SortStackUsingReccursion sq = new SortStackUsingReccursion();
        Stack<Integer> st = new Stack<>();
        st.push(30);
        st.push(10);
        st.push(20);
        st.push(5);

        sq.sortStack(st);

        System.out.println(st);
    }
}
