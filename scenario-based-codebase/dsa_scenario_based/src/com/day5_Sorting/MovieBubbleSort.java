package com.day5_Sorting;

import java.util.Arrays;

public class MovieBubbleSort {
    public static void sortShowtimes(String[] shows) {
        int n = shows.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent showtimes
                if (shows[j].compareTo(shows[j + 1]) > 0) {
                    // Swap shows[j] and shows[j+1]
                    String temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Today's showtimes entered manually by the manager
        String[] showtimes = {"21:00", "10:30", "18:15", "09:00", "13:00"};

        System.out.println("Manager's Entry: " + Arrays.toString(showtimes));

        sortShowtimes(showtimes);

        System.out.println("Sorted Schedule (Earliest First): " + Arrays.toString(showtimes));
    }
}