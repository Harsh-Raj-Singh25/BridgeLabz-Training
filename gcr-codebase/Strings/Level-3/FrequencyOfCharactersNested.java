import java.util.*;
// frequency of characters in a string using nested loops
public class FrequencyOfCharactersNested {
	// method to count frequency
    public static String[] characterFrequency(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] frequency = new int[n];
        for (int i = 0; i < n; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j] && chars[i] != '0') {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                resultList.add("Character: '" + chars[i] + "' Frequency: " + frequency[i]);
            }
        }
        return resultList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// take user input
        System.out.print("enter your string: ");
        String input = scanner.nextLine();
        String[] frequencies = characterFrequency(input);
        System.out.println("Character Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }
        scanner.close();
    }
}