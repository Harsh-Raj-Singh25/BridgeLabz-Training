package com.StackAndQueues.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;

public class SlidingWindowMax {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0; // result index
        
        // Deque will store indices
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            //  Remove indices that are out of the current window range
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            
            // Remove indices of all elements smaller than the current element
            // (They are no longer useful because the current element is larger)
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            //  Add current element's index to the deque
            deque.offerLast(i);
            
            //  If we have reached at least the size of the first window,
            // the front of the deque is our maximum for the current window.
            if (i >= k - 1) {
                result[ri++] = nums[deque.peekFirst()];
            }
        }
        
        return result;
    }
}
