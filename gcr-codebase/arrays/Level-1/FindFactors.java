import java.util.*;
public class FindFactors{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//take an integer input
		System.out.println("Enter your number");
		int number=s.nextInt();
		// creating factors array and defining its length maxFactor
		int maxFactor=10;
		int [] factors=new int[maxFactor];
		int index=0;
		
		// Loop from 1 to the number to find factors and store them
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if the array is full (index reaches maxFactor)
                if (index == maxFactor) {
                    // Double the size
                    maxFactor = maxFactor* 2;
                    int[] temp = new int[maxFactor];

                    // Copy existing elements in to the temp 
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign factors array to the temp array
                    factors = temp;
                    System.out.println("The Array was resized to " + maxFactor);
                }

                // Add factor to the array and increment index
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.println("The factors of the " + number + " are : ");
        for (int k = 0; k < index; k++) {
            System.out.print(factors[k] + (k == index - 1 ? "" : ", "));
        }
        System.out.println();

        s.close();
    }
}