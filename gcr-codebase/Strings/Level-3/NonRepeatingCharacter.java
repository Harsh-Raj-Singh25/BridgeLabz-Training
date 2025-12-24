import java.util.*;
public class NonRepeatingCharacter {
    static char firstNonRepeatingCharacter(String str) {
        int[] charCount = new int[256];
        // Count frequency of character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        // first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String input = sc.nextLine();

        char result = firstNonRepeatingCharacter(input);
        if (result != '\0') {
            System.out.println("non-repeating character : " + result);
        } else {
            System.out.println("No non-repeating character");
        }
    }
}