public class StringArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        handleArrayIndexOutOfBoundsException();
        generateArrayIndexOutOfBoundsException();
    }

    // generating Exception
    public static void generateArrayIndexOutOfBoundsException() {
        String[] names = {"harsh", "pratul", "madhur"};
        System.out.println(names[5]);
    }

    // handling Exception
    public static void handleArrayIndexOutOfBoundsException() {
        String[] names = {"harsh", "pratul", "madhur"};
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}