import java.util.*;
public class AreaTriangle{
    public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the base length : ");
		double base = sc.nextDouble();
		System.out.println("enter the height : ");
		double height=sc.nextDouble();
		// calculating the area of triangle [ area=(1/2) * base * height ] in square centimeters
		double area=area=0.5 * base * height;
		// calculating the area of triangle [ area=(1/2) * base * height ] in square inches
		double area_Inches=area/6.452;
		
		// Output
		System.out.println("The area of traingle in square inches is "+ area_Inches+ " and in square centimeters is " + area);
	}
}