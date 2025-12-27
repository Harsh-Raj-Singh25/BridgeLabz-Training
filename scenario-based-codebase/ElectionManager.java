import java.util.*;
// This program manages a simple election voting system.
public class ElectionManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("age (-1 to exit): ");
            int age = sc.nextInt();
            if (age == -1) {
                System.out.println("Exiting");
                break;
            }
            if (age < 18) {
                System.out.println("eligible");
                continue;
            }
            System.out.print("vote (1, 2, or 3 for candidates): ");
            int vote = sc.nextInt();
            if (vote == 1 || vote == 2 || vote == 3) {
                System.out.println("Thank you for voting for candidate " + vote + "!");
            } else {
                System.out.println("Invalid vote. Please enter 1, 2, or 3.");
            }
        }
        sc.close();
    }
}