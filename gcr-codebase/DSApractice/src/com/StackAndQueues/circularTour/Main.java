package com.StackAndQueues.circularTour;

public class Main{
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        CircularTour ct = new CircularTour();
        System.out.println(ct.findStartingPoint(petrol, distance)); // 1
    }
}
