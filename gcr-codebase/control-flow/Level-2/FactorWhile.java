import java.util.Scanner;

public class FactorWhile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //Take input from user
        System.out.println("enter your number : ");
        int number=sc.nextInt();

        //check whether the number is positive
        if(number<=0){
            System.out.println("The number entered is not positive");
        }else{
            // run a for loop from 1 to number and print if number%i=0
            int i=1;
            while(i<number){
                if (number % i==0){
                    System.out.println(i);
                }
                i++;
            }
        }
        sc.close();
    }
}
