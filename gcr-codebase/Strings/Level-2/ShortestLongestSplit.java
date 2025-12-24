import java.util.*;
// split the text into words and find the shortest and longest strings

public class ShortestLongestSplit {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("sentence: ");
        String text = scanner.nextLine();
        String[] words = splitString(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        int[] shortestLongest = findShortestLongest(wordsWithLengths);
        System.out.println("Shortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);

        scanner.close();
    }
	
	// methods for performing the operations:
    public static String[] splitString(String str) {
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        int startIndex = 0;
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                words[wordIndex] = str.substring(startIndex, i);
                wordIndex++;
                startIndex = i + 1;
            }
        }
        return words;
    }
	// lenght method
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // handle when index is out of bounds
        }
        return count;
    }
	 // words length method
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }
	// find the shortestLongest method
    public static int[] findShortestLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];

        for (int i = 1; i < wordsWithLengths.length; i++) {
            if (getStringLength(wordsWithLengths[i][0]) < getStringLength(shortest)) {
                shortest = wordsWithLengths[i][0];
            }
            if (getStringLength(wordsWithLengths[i][0]) > getStringLength(longest)) {
                longest = wordsWithLengths[i][0];
            }
        }
        return new int[] { getStringLength(shortest), getStringLength(longest) };
    }
}