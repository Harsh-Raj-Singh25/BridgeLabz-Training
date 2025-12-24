//  vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
import java.util.*;
public class DisplayVowelsConsonants {
    // character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // find vowels and consonants
    public static String[][] findVowelsAndConsonants(String str) {
        String[][] resultArray = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacter(ch);
            resultArray[i][0] = Character.toString(ch);
            resultArray[i][1] = result;
        }
        return resultArray;
    }

    // display the 2D Array in Tabular Format
    public static void displayResults(String[][] results) {
        System.out.print(Arrays.DeepToString(results).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print(" enter string: ");
        String inputString = sc.nextLine();
        displayResults(findVowelsAndConsonants(inputString));

        sc.close();
    }
}