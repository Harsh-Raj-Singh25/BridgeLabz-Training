import java.util.*;

// program to find the shortest, tallest, and mean height of players present in a football team.
class PlayersHeight {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.println("Heights of players: " + Arrays.toString(heights));
        System.out.println("Sum of heights: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
    }
	//  method for sum of heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
	// method for mean height
    public static double calculateMean(int sum, int numberOfElements) {
        return (double) sum / numberOfElements;
    }
	// method for shortest player
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
	// method for tallest player
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}