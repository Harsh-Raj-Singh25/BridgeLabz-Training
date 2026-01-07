package BookBazaar;

public class Main {
    public static void main(String[] args) {
        // 1. Create Inventory
        Book javaRef = new PrintedBook("Java: The Complete Reference", "Herbert Schildt", 45.0, 10, 1.2);
        Book cleanCode = new EBook("Clean Code", "Robert Martin", 25.0);

        // 2. Create Order
        Order userOrder = new Order();
        userOrder.addBook(javaRef, 1);
        userOrder.addBook(cleanCode, 1);

        // 3. Process Checkout
        userOrder.checkout();

        // 4. Verify Stock Encapsulation
        System.out.println("\nRemaining stock for Printed Book: " + javaRef.getStock());
    }
}
