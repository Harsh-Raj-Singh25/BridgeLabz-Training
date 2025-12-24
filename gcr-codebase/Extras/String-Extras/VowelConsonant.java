1. Count Vowels and Consonants
Problem:
//Write a Java program to count the number of vowels and consonants in a given string.

import java.util.*;
public class VowelConsonant{
    // check character is a vowel or consonant
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not an alphabet";
        }
    }
    // find vowels and consonants
    public static int[] findVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// take user input
        System.out.print("string: ");
        String s = scanner.nextLine();
        int[] counts = findVowelsAndConsonants(s);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        scanner.close();
    }
}