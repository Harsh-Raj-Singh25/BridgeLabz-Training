package com.day6_Sorting.IcecreamRush;

public class FlavorBubbleSort {
	public static void sort(Flavor [] flavors) {
        int n = flavors.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent showtimes
                if (flavors[j].quantity > (flavors[j + 1].quantity) ) {
                    // Swap shows[j] and shows[j+1]
                    Flavor temp = flavors[j] ;
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }

}
