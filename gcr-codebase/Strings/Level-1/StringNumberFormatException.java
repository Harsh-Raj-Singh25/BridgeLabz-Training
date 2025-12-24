public class StringNumberFormatException {
    public static void main(String[] args) {
        handleNumberFormatException();
        generateNumberFormatException();
    }

    // generating NumberFormatException
    public static void generateNumberFormatException() {
        String text = "abc123";
        System.out.println(Integer.parseInt(text));
    }

    // handling NumberFormatException
    public static void handleNumberFormatException() {
        String text = "abc123";
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}