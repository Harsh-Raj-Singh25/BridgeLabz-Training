import java.util.Scanner;

public class GreatestFactorwhile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //Take input from user
        System.out.println("enter your number : ");
        int number=sc.nextInt();
        int greatestFactor=1;
        //define a counter and run a while loop to check factors
        int counter=number-1;
        while(counter>1){
            if (number % counter ==0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        // Print the greatest factor
        System.out.println("the greatest factor is : "+greatestFactor);

        sc.close();
    }
}
