import java.util.*;
// This program manages fare deduction from a metro smart card based on distance traveled.
public class MetroCardFareDeduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 100.0; // Initial balance on the metro card
        while (true) {
            System.out.println("Current balance: ₹" + balance);
            System.out.print("distance (-1 to exit): ");
            int distance = sc.nextInt();
            if (distance == -1) {
                System.out.println("Exiting. Final balance: ₹" + balance);
                break;
            }
            double fare = (distance <= 5) ? 10.0 : (distance <= 15) ? 20.0 : 30.0;
            if (fare > balance) {
                System.out.println("Insufficient balance. recharge your card.");
                continue;
            }
            balance -= fare;
            System.out.println("Fare for " + distance + " km is ₹" + fare + ". New balance: ₹" + balance);
            if (balance <= 0) {
                System.out.println("Balance exhausted. recharge your card.");
                break;
            }
        }
        sc.close();
    }
}