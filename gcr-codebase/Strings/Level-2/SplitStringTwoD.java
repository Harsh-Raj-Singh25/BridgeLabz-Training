import java.util.*;
// split the text into words and return the words along with their lengths in a 2D array
public class SplitStringTwoD {

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

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sentence: ");
        String text = sc.nextLine();
        String[] words = splitString(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        System.out.println(Arrays.deepToString(wordsWithLengths));
        sc.close();
    }

    
}