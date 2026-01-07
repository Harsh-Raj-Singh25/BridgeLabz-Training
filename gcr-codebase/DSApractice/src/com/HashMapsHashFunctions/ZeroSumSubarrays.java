package com.HashMapsHashFunctions;

import java.util.*;

public class ZeroSumSubarrays {
    public static void findSubarrays(int[] arr) {
        // Map to store: Cumulative Sum -> List of indices
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        int cumulativeSum = 0;
        
        // Base Case: A sum of 0 is seen at index -1 
        // (This handles subarrays starting from index 0)
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        System.out.println("Zero Sum Subarrays found:");

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            // If the sum has been seen before, we found zero-sum subarray(s)
            if (map.containsKey(cumulativeSum)) {
                List<Integer> previousIndices = map.get(cumulativeSum);
                
                for (Integer prevIdx : previousIndices) {
                    System.out.println("From index " + (prevIdx + 1) + " to " + i);
                }
            }

            // Store the current index for this cumulative sum
            map.computeIfAbsent(cumulativeSum, k -> new ArrayList<>()).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        findSubarrays(arr);
    }
}
