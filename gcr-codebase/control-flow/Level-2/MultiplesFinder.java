import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // get user input
        System.out.println("enter your number");
        int number=sc.nextInt();

        // check if the number is positive and less than 100
        if(number<=0 || number>=100){
            System.out.println("Invalid input");
        }else{
            // find and print the values between 1 and 100 divisible by number
            for(int i=100;i>=1;i--){
                if (i%number == 0){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
