package BookBazaar;

import java.util.ArrayList;
import java.util.List;

class Order {
    private static int idCounter = 100;
    private final String orderId;
    private String status; // Restricted access
    private List<Book> orderedItems = new ArrayList<>();

    public Order() {
        this.orderId = "BB-" + (idCounter++);
        this.status = "PENDING";
    }

    public void addBook(Book book, int qty) {
        if (book.getStock() >= qty) {
            orderedItems.add(book);
            book.reduceStock(qty);
            System.out.println("Added to Order: " + book.getTitle());
        }
    }

    // ACCESS MODIFIER: Only internal logic can move status to SHIPPED
    protected void markAsShipped() {
        this.status = "SHIPPED";
    }

    public void checkout() {
        double total = 0;
        System.out.println("\n--- INVOICE: " + orderId + " ---");
        
        for (Book b : orderedItems) {
            // OPERATORS: price * quantity (simplified to 1 here) - discount
            double discountedPrice = b.applyDiscount(b.getPrice());
            total += discountedPrice;
            System.out.println(b.getTitle() + ": Rs." + discountedPrice);
        }
        
        System.out.println("---------------------------");
        System.out.println("TOTAL PAYABLE: Rs." + total);
        this.status = "COMPLETED";
    }
}
