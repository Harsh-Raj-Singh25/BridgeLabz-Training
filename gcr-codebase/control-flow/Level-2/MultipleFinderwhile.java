import java.util.Scanner;

public class MultipleFinderwhile {
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
            int counter=100;
            while(counter>=1){
                if(counter % number ==0){
                    System.out.println(counter);
                }
                counter--;
            }
        }
        sc.close();
    }
}
