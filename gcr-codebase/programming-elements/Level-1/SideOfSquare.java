import java.util.*;
public class SideOfSquare{
    public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the perimeter : ");
		int perimeter=sc.nextInt();
		int side=perimeter/4;
		
		//OUTPUT
		System.out.println("The length of the side is "+ side+" whose perimeter is "+ perimeter);
	}
}
		