package com.HashMapsHashFunctions;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        // Initialize HashMap (Number -> IsVisited)
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, false);
        }

        int longestStreak = 0;

        // Iterate through the array
        for (int num : nums) {
            // Only process if we haven't visited this number yet
            if (map.containsKey(num) && !map.get(num)) {
                
                // Mark current as visited
                map.put(num, true);
                int currentStreak = 1;

                // Look forward (num + 1, num + 2...)
                int forward = num + 1;
                while (map.containsKey(forward) && !map.get(forward)) {
                    map.put(forward, true);
                    forward++;
                    currentStreak++;
                }

                // Look backward (num - 1, num - 2...)
                int backward = num - 1;
                while (map.containsKey(backward) && !map.get(backward)) {
                    map.put(backward, true);
                    backward--;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 1, 3, 2, 4};
        System.out.println("Longest Sequence Length: " + longestConsecutive(arr));

    }
}
