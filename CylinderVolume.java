import java.util.*;
public class CylinderVolume{
    public static void main(String [] args){
	    Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the radius of the cylinder: ");
        double RADIUS = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double HEIGHT = scanner.nextDouble();

        // Formula: Volume = π * r^2 * h
        double VOLUME = Math.PI * RADIUS * RADIUS * HEIGHT;

        System.out.println("The volume of the cylinder is" + VOLUME );

        scanner.close();
}
}