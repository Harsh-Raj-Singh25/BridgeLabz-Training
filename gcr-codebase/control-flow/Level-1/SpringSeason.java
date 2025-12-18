import java.util.*;
public class SpringSeason{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		// Take the month and day values
        System.out.println("Enter your month and day");
		int month=s.nextInt();
		int date = s.nextInt();
		
		//check whether its spring season or not.
		if(month>3 && month<6){
			System.out.println("Its a Spring Season");
		}else if((month==3 && date>=20) || (month==6 && date<=20) ){
			System.out.println("Its a Spring Season");
		}else{
			System.out.println("Not a Spring Season");
		}
	}
}