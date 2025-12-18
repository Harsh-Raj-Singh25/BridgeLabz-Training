import java.util.Scanner;

public class NumberPowerwhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // take user input for number and power
        System.out.println("Enter the number and the required power");
        int number= sc.nextInt();
        int power= sc.nextInt();
        //declare initial result
        int result=1;
        // Check if input is valid or not
        if(number<=0 || power<=0){
            System.out.println("Invalid input");
        }else {
            // declare the counter
            // Calculate the result of power operation using while loop
            int counter=1;
            while(counter<=power){
                result *= number;
                counter++;
            }
        }
        System.out.println("The resultant output is : "+result);

        sc.close();
    }
}
