import java.util.Scanner;

public class TrigonometricFunctionCalculation {
	// Creating a method to do the calculations
	public double[] calculateTrigonometricFunctions(double angle){
		// convert the angle to radian
		double rAngle=angle * 3.14 /180;
		// initialize an array to store the reults of the 3 functions
		double [] result=new double[3];
		// performing the operations and storing them in array:
		// sine
		result[0]=Math.sin(rAngle);
		// cosine
		result[1]=Math.cos(rAngle);
		// tangent
		result[2] = Math.tan(rAngle);
		
		// returning the array
		return result;
		
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Take user input 
		System.out.println("Enter your angle value ");
		double angle=sc.nextDouble();
		// create the object
		TrigonometricFunctionCalculation calculator=new TrigonometricFunctionCalculation();
		// call the method and store results in array
		double [] array=calculator.calculateTrigonometricFunctions(angle);
		
		// displaying the results using 
		System.out.println("The sine value is :"+ array[0] + "\n The cosine number is : "+ array[1]+ "\n the tangent value is : "+array[2]);
	}
}