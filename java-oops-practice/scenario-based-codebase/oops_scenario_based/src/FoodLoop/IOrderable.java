package FoodLoop;
/*
 * 20. "FoodLoop – Restaurant Ordering System"
Story: FoodLoop is an app where users place food orders from local restaurants.
Requirements:
● FoodItem class: name, category, price, availability.
● Order class: contains list of food items and total.
● Interface IOrderable with placeOrder() and cancelOrder().
● Use constructors to create custom combo meals.
● Operators: total price = sum of item prices – discounts.
● Encapsulation: keep item stock levels hidden.
● Inheritance: VegItem, NonVegItem extend FoodItem.
● Polymorphism: applyDiscount() varies by order total.
 */

public interface IOrderable {
	void placeOrder();
	void cancelOrder();
}
