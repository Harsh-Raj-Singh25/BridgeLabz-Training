import java.util.*;
public class CircleArea{
    public static void main(String [] args){
	    Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the radius : ");
        double RADIUS = scanner.nextDouble();
		
		//Area
		double AREA=Math.PI*RADIUS*RADIUS;
		
		System.out.print("Area of the circle is:"+ AREA);
		
		scanner.close();
	}
}