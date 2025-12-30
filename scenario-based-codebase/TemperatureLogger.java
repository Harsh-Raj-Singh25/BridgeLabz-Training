/* 11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/
import java.util.*;
public class TemperatureLogger{
	// setting days=7
	static int days=7;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		// initializing a array that'll store the temperatures over 7 days:
		double [] temperature=new double[days];
		System.out.println("----WELCOME TO THE DAILY TEMPERATURE LOGGER----");
		// take input from user:
		for(int i=0;i<days;i++){
			System.out.print(" Enter the temperature in Celsius for day "+(i+1)+" : ");
			temperature[i]=sc.nextDouble();
		}
		// calling the method to calculate average temperature and the maximum temperature
		double [] array=averageAndMax(temperature);
		
		// Displaying the results:
		System.out.println();
		System.out.println("--- The Temperature stats for the week are:----");
		System.out.printf("Average Temperature : %-10s ||  Maximum Temperature : %-15s%n ",array[0],array[1]);
		
	}
	
	// METHOD TO CALCULATE AVERAGE AND MAX TEMPERATURE
	public static double[] averageAndMax(double [] array){
		double max=array[0];
		double average=0;
		int sum=0;
		for(int i=0;i<days;i++){
			sum+=array[i];
			if(max<array[i]){
				max=array[i];
			}
		}
		average=sum/days;
		return new double[]{average,max};
	}
	
}
		