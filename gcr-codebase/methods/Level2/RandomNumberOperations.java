import java.util.*;

public class RandomNumberOperations {
	
	// generate an array of random Numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Formula: (Math.random() * (max - min + 1)) + min
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }
	// Find the minimum and maximum and the average of the numbers of generated array.
    public double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[0];

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, (double)min, (double)max};
    }
	
    public static void main(String[] args) {
		// create an object of the class
        RandomNumberOperations rs = new RandomNumberOperations();

        // Generate array of 5 random 4-digit numbers using the method
        int[] randomNumbers = rs.generate4DigitRandomArray(5);
        System.out.println("Generated Numbers: " + Arrays.toString(randomNumbers));

        // Find Average, Min, and Max using the method
        double[] stats = rs.findAverageMinMax(randomNumbers);

        // Display Results
        System.out.printf("Average Value: %.2f%n", stats[0]);
        System.out.println("Minimum Value: " + (int)stats[1]);
        System.out.println("Maximum Value: " + (int)stats[2]);
    }
}