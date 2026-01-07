package com.StackAndQueues.circularTour;

import java.util.*;

class CircularTour {

    static int findStartingPoint(int[] petrol, int[] distance) {
        int start = 0;
        int currentFuel = 0;
        int totalSurplus = 0;

        for (int i = 0; i < petrol.length; i++) {
            int gain = petrol[i] - distance[i];

            currentFuel += gain;
            totalSurplus += gain;

            if (currentFuel < 0) {
                start = i + 1;
                currentFuel = 0;
            }
        }

        return totalSurplus >= 0 ? start : -1;
    }

}