import java.util.*;
// three integer inputs from the user and finds the maximum of the three numbers.
public class LargestNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = takeInput(sc);
        System.out.println("maximum number : " + findMaximum(numbers));
        sc.close();
    }
	//method for input
    public static int[] takeInput(Scanner sc) {
        int[] numbers = new int[3];
        System.out.println("Enter three numbers:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}