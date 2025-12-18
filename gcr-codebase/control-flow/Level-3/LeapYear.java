import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // take year as input
        System.out.println("Enter your year");
        int year=sc.nextInt();
        // check for year 1582 factor and if not less than 1582 then proceed further
        if (year<1582){
            System.out.println("Invalid year : due to 1582 factor");
        }else{
            // check for leap year
            if(year%400==0){
                System.out.println("The year "+ year+" is a leap year");
            } else if (year%100==0) {
                System.out.println("The year "+ year+" is a not leap year");
            } else if (year % 4 == 0) {
                System.out.println("The year "+ year+" is a leap year");
            }else{
                System.out.println("The year "+ year+" is not a leap year");
            }


        }
        sc.close();



    }
}
