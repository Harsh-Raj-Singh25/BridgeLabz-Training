import java.util.*;

class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// take user input
		System.out.println(" enter your number : ");
        int number = sc.nextInt();
		// use of methods
        int count = countDigits(number);
        int[] digitsArray = storeDigits(number, count);
        int sumOfDigits = calculateSumOfDigits(digitsArray);
        int sumOfSquares = calculateSumOfSquares(digitsArray);
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        int[][] frequencyArray = findDigitFrequency(digitsArray);
		
		// display the results
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + count);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad Number: " + isHarshad);
        System.out.println("Digit Frequency: " + Arrays.deepToString(frequencyArray));
    }

    // count digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    // store digits in an array
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    // calculate sum of digits
    public static int calculateSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    // calculate sum of squares of digits
    public static int calculateSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    // check if harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }
    // find frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
}