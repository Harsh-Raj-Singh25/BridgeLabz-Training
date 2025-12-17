import java.util.*;
public class RectanglePerimeter{
    public static void main(String [] args){
	    Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the length of the rectangle: ");
        double LENGTH = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double WIDTH = scanner.nextDouble();

        // Formula: P = 2 * (l + w)
        double PERIMETER = 2 * (LENGTH + WIDTH);

        System.out.print("The perimeter of the rectangle is: " + PERIMETER);

        scanner.close();
    }
}