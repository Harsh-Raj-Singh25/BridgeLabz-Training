import java.util.Arrays;
// split the text into words, compare the result with the split() method
public class SplitString {

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
	
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
	
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("sentence: ");
        String text = scanner.nextLine();

        String[] wordsWithoutMethod = splitString(text);
        String[] wordsWithMethod = text.split(" ");

        System.out.println(Arrays.toString(wordsWithMethod));
        System.out.println(Arrays.toString(wordsWithoutMethod));

        System.out.println(compareStringArrays(wordsWithoutMethod, wordsWithMethod));

        scanner.close();
    }

    
}