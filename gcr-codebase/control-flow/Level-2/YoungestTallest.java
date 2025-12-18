import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //take age and height of the three friends
        System.out.println("Enter age and height of Amar");
        int ageAmar=sc.nextInt();
        int heightAmar=sc.nextInt();
        System.out.println("Enter age and height of Akbar:");
        int ageAkbar=sc.nextInt();
        int heightAkbar=sc.nextInt();
        System.out.println("Enter age and height of Anthony:");
        int ageAnthony=sc.nextInt();
        int heightAnthony=sc.nextInt();

        // Find and display the youngest friend
        if (ageAmar<ageAkbar && ageAmar<ageAnthony){
            System.out.println("Amar is the youngest");
        }else if(ageAkbar<ageAmar && ageAkbar<ageAnthony){
            System.out.println("Akbar is the youngest");
        }else{
            System.out.println("Anthony is the youngest");
        }

        // Find the display the friend with the largest height
        if (heightAmar>heightAkbar && heightAmar>heightAnthony){
            System.out.println("Amar is the tallest");
        }else if(heightAkbar>heightAmar && heightAkbar>heightAnthony){
            System.out.println("Akbar is the tallest");
        }else{
            System.out.println("Anthony is the tallest");
        }

        sc.close();

    }
}
