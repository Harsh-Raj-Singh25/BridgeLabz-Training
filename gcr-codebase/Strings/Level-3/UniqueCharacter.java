import java.util.*;
public class UniqueCharacter{
	// Methods:
	public static int stringLength(String text) {
        int count = 0;
        try {
            for(int i = 0 ; i < text.length() ; i++){
		count++;
		}
        } catch (Exception e) {
            // System.out.print(e.message);
        }
        return count;
    }
	// method to find unique characters
    public static char[] uniqueCharacters(String text) {
        int len = stringLength(text);
        char[] result = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result[index++] = current;
            }
        }
        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = result[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String text = sc.nextLine();
        char[] unique = uniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char ch : unique) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}