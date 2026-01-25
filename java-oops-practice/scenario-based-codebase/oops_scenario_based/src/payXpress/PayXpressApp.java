package payXpress;

import java.util.ArrayList;
import java.util.List;

//Main Execution
public class PayXpressApp {
	public static void main(String[] args) {
		// Polymorphism: Store different bills in a single list
		List<IPayable> monthlyBills = new ArrayList<>();

		monthlyBills.add(new ElectricityBill(120.50, "2026-02-05"));
		monthlyBills.add(new InternetBill(60.00, "2026-02-10"));
		monthlyBills.add(new WaterBill(35.25, "2026-02-15"));

		System.out.println("--- Processing Monthly Reminders ---");
		for (IPayable bill : monthlyBills) {
			bill.sendReminder(); // Polymorphic behavior: Each bill speaks differently
		}

		System.out.println("\n--- Processing Payments ---");
		// Accessing base class features via casting
		for (IPayable payable : monthlyBills) {
			Bill billRef = (Bill) payable;

			if (!billRef.getIsPaid()) {
				System.out.println("Calculating total for late " + billRef.type + " payment: Rs."
						+ billRef.calculateTotalWithLateFee());
				payable.pay(billRef.amount);
			}
		}
	}
}