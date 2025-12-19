import java.util.*;
public class YoungestTallest{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		// initializing the age and height and name array for for Amar, Akbar and Anthony
		int [] age=new int[3];
		int [] height=new int [3];
		String [] names={"Amar","Akbar", "Anthony"};
		//Taking input ages and heights
		System.out.println("Enter your age and height:-");
		for(int i=0;i<3;i++){
			System.out.println("Enter age and height for :"+names[i]);
			age[i]=sc.nextInt();
			height[i]=sc.nextInt();
		}
		// initializing shortest and youngest to first friend
		int tallest=0;
		int youngest=0;
		
		//looping to find the result
		for(int i=0;i<3;i++){
			if(age[i]<age[youngest]){
				youngest=i;
			}
			if(height[i]>height[tallest]){
				tallest=i;
			}
		}
		
		// Dislay the results
		System.out.println("the youngest friend is : "+ names[youngest]);
		System.out.println("the tallest friend is : "+ names[tallest]);
		
		sc.close();
	}
}
        		
		
		