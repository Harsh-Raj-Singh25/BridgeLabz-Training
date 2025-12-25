import java.util.*;
// user thinks of a number between 1 and 100, and the computer tries to guess the number
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100.");
        System.out.print("Enter the number : ");
        sc.nextLine();

        int low = 1;
        int high = 100;
        String feedback = "";

        while (!feedback.equals("correct")) {
            int guess = generateGuess(low, high);
            System.out.println("number " + guess + "? (high/low/correct)");
            feedback = sc.nextLine().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (!feedback.equals("correct")) {
                System.out.println("high, low, or correct.");
            }
        }

        System.out.println("Yay! I guessed your number!");
        sc.close();
    }

    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }
}