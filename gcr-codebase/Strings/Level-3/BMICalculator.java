import java.util.*;
class BMICalculator{

	// Writing the logic and function to find the BMI.
	public static void bmiCalculator(double[][] array){
		String[] status = new String[array.length];
		for(int i = 0; i < array.length ; i++){
			array[i][2] = array[i][1] / (array[i][0] * array[i][0]);
			if(array[i][2] <= 18.4){
				status[i] = "Underweight";
			}else if(array[i][2] >= 18.5 && array[i][2] <= 24.9){
				status[i] = "Normal";
			}else if(array[i][2] >= 25.0 && array[i][2] <= 39.9){
				status[i] = "Overweight";
			}else if(array[i][2] >= 40.0){
				status[i] = "Obese";
			}else{
				return;
			}
		}
		System.out.println(Arrays.deepToString(status));
		System.out.println(Arrays.deepToString(array));
	}
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[][] array = new double[10][3];
		// Taking input
		for(int i = 0 ;	i< 10 ; i++){
			System.out.print("Height : ");
			double height = sc.nextDouble();
			System.out.print("weight : ");
			double weight = sc.nextDouble();
			array[i][0] = height/100.0;
			array[i][1] = weight;
		}
		bmiCalculator(array);

		// Close the Scanner class
		sc.close();
	}
	
}