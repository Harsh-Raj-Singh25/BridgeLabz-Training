import java.util.Scanner;

public class VotingEligibilityChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// defining an empty array of size 10
        int[] ages = new int[10];
		//creating the object
        VotingEligibilityChecker checker = new VotingEligibilityChecker();

        for (int i = 0; i < 10; i++) {
			// take user input for the students' ages
            System.out.print("Enter age for student number " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
			// check condition using method
            if (checker.checkEligibility(ages[i])) {
                System.out.println("Can Vote: YES");
            } else {
                System.out.println("Can Vote: NO ");
            }
        }
        sc.close();
    }

    public boolean checkEligibility(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
}