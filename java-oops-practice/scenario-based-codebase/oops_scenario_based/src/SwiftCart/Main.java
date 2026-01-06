package SwiftCart;

public class Main {
    public static void main(String[] args) {
        //  Create Products
        Product milk = new PerishableProduct("Amul Milk", 60.0);
        Product rice = new NonPerishableProduct("Basmati Rice", 500.0);
        Product apples = new PerishableProduct("Kashmir Apples", 180.0);

        // Initialize Cart
        Cart myCart = new Cart();
        myCart.addItem(milk);
        myCart.addItem(rice);
        myCart.addItem(apples);

        System.out.println("==============================================");
        System.out.println("       WELCOME TO SWIFTCART GROCERY       ");
        System.out.println("==============================================");

        // Generate Bill
        myCart.generateBill();

        //  Calculate Final Price with Discounts
        double couponValue = 50.0; // Seasonal Coupon
        double payableAmount = myCart.applyDiscount(couponValue);

        System.out.println("Discounts Applied (Type-based + Coupon)");
        System.out.printf("FINAL PAYABLE AMOUNT: Rs. %.2f%n", payableAmount);
        System.out.println("==============================================");
    }
}
