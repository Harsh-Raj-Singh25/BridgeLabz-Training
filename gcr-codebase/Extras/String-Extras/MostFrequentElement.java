import java.util.*;
public class MostFrequentElement{
	// method to fetch most occurred character 
	public static char mostFreq(String str) {
        // Use an array to store the count of all 256 ascii values
        int [] count =new int [256];
		
        // Iterate through each character of the input string
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
		int max=-1;
		char result=' ';
		for(int i=0;i<str.length();i++){
			if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("Enter your string : ");
        String s = sc.next();
		// using method and display the result
		System.out.println("The most frequent character is "+mostFreq(s) );
		
		sc.close();
	}
}