import java.util.Scanner;

public class NaturalSumComparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.err.println("Invalid number");
            System.exit(0);
        } else {
            int recursiveRes = recursiveSum(number);
            int formulaRes = formulaSum(number);
            
            System.out.println("Recursive Sum: " + recursiveRes);
            System.out.println("Formula Sum: " + formulaRes);
            System.out.println("Both computations match: " + (recursiveRes == formulaRes));
        }
        sc.close();
    }

    public static int recursiveSum(int number) {
        if (number == 1) return 1;
        return number + recursiveSum(number - 1);
    }

    public static int formulaSum(int number) {
        return number * (number + 1) / 2;
    }
}