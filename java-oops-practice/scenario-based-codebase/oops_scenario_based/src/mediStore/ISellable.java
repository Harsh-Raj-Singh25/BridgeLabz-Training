package mediStore;
/*
 * 17. "MediStore – Pharmacy Inventory & Sales System"
Story: A pharmacy chain needs an app to manage drug inventory, sales, and expiry tracking.
Requirements:
● Medicine class: name, price, expiryDate, quantity.
● Interface ISellable with sell() and checkExpiry() methods.
● Constructors for medicines with default quantity.
● Use operators: total price, discount, stock adjustments.
● Encapsulation: internal stock and cost details are hidden.
● Inheritance: Tablet, Syrup, Injection extend Medicine.
● Polymorphism: checkExpiry() works differently for preserved vs liquid meds.
● Access Modifiers: make sensitive pricing logic private.
 */

public interface ISellable {
	void checkExpiry();
	void sell(int number);
}
