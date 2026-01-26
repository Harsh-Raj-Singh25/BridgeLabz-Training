package com.exceptionHandling.multipleCatchBlocks;
public class ArrayAccessHandler {

    public static void accessArray(int[] arr, int index) {
        try {
            // Potential NullPointerException or ArrayIndexOutOfBoundsException
            int value = arr[index];
            System.out.println(" Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Triggers if index < 0 or index >= arr.length
            System.out.println(" Error: Invalid index!");

        } catch (NullPointerException e) {
            // Triggers if the array object hasn't been created (is null)
            System.out.println(" Error: Array is not initialized!");

        } catch (Exception e) {
            // The "Safety Net": Catches any other unexpected errors
            System.out.println(" An unexpected error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] myNumbers = {10, 20, 30};

        System.out.println("--- Scenario 1: Valid Access ---");
        accessArray(myNumbers, 1);

        System.out.println("\n--- Scenario 2: Out of Bounds ---");
        accessArray(myNumbers, 5);

        System.out.println("\n--- Scenario 3: Null Array ---");
        int[] emptyArray = null;
        accessArray(emptyArray, 0);
    }
}
