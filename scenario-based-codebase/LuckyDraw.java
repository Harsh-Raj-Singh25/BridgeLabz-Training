/* 20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/
import java.util.*;
public class LuckyDraw{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		boolean playing=true;
		while(playing){
			System.out.print("!ENTER YOUR NUMBER -:");
			int number=sc.nextInt();
			if(number %3==0 && number % 5 == 0){
				System.out.println("!!-!! CONGRATULATIONS !!-!!");
				System.out.println("!!!---YOU WON A GIFT---!!!");
				System.out.println();
				
			}else{
				System.out.println("!! BETTER LUCK NEXT TIME !!");
				System.out.println();
				continue;
			}
		}
	}
}
			