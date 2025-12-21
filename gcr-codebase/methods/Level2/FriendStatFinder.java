import java.util.Scanner;

public class FriendStatFinder {
	
	// method for age check
	public static int findYoungestIndex(int[] ages) {
        int min = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[min]) {
				min = i;
			}
        }
        return min;
    }
	
	// method for heights check
    public static int findTallestIndex(double[] heights) {
        int max = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[max]){
				max = i;
			}
        }
        return max;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// taking a string of the names
        String[] friends = {"Amar", "Akbar", "Anthony"};
		// declare a new array
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Details for " + friends[i] + ":");
            System.out.print("Age: "); ages[i] = sc.nextInt();
            System.out.print("Height (cm): "); heights[i] = sc.nextDouble();
        }
		
		// display output
        System.out.println("Youngest: " + friends[findYoungestIndex(ages)]);
        System.out.println("Tallest: " + friends[findTallestIndex(heights)]);
        sc.close();
    }

    
}