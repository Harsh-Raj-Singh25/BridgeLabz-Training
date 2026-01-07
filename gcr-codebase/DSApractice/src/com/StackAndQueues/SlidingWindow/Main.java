package com.StackAndQueues.SlidingWindow;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Window Size: " + k);
        
        SlidingWindowMax newM=new SlidingWindowMax();
        
        int[] result = newM.maxSlidingWindow(nums, k);
        System.out.println("Sliding Window Maximums: " + Arrays.toString(result));
    }
}
