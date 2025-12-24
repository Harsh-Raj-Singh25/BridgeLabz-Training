public class StringLength {
	// method for counting the length and also handling exception
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
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("string: ");
        String inputString = scanner.next();
		// finding length using the created method
        int lengthWithoutMethod = getStringLength(inputString);
        int lengthWithMethod = inputString.length();

        System.out.println("with length() : " + lengthWithoutMethod);
        System.out.println("without length() : " + lengthWithMethod);

        scanner.close();
    }
    
}