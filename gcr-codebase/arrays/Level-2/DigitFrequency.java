import java.util.Scanner;

public class DigitFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your number : ");
        long number = sc.nextLong();
        
        // 1. Find digit count for array initialization
        int count = 0;
        long tempNum=number;
        while (tempNum > 0) {
            tempNum /= 10;
            count++;
        }
        
        //  Save the digits in an array
        int[] digitsArray = new int[count];
        long tempNum1=number;
        for (int i = 0; i < count; i++) {
            digitsArray[i] = (int) (tempNum1 % 10);
            tempNum1 /= 10;
        }
        
        //Define a frequencies array of size 10 (for 0-9)
        int[] frequency = new int[10];
        
        //Increase frequency count of each digit
        for (int i = 0; i < count; i++) {
            int digitValue = digitsArray[i];
            frequency[digitValue]++;
        }
        
        //  Display the  frequencies
        System.out.println("Digit Frequencies : ");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " comes " + frequency[i] + " times.");
            }
        }
        
        sc.close();
    }
}