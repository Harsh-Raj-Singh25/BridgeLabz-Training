import java.util.Scanner;

public class factor {
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
            for (int i=1;i<number;i++){
                if (number % i==0){
                    System.out.println(i);
                }
            }
        }

        sc.close();

    }
}
