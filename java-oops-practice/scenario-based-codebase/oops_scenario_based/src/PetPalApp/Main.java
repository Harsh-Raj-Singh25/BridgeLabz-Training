package PetPalApp;

public class Main {
	public static void main(String [] args) {
		Pet pets[]= {
				new Dog("Tommy",5),
				new Cat("kitty",4),
				new Bird("mitthuu",2)
		};
		System.out.println("Welcome to PetPal – Virtual Pet Care App ");
		System.out.println("=========================================");
		for(Pet pet:pets) {
			pet.makeSound(); // polymorphism: same method multiple implementations
			pet.displayStatus();// current state of the pet
			
			pet.feed();// 1st interaction
			pet.play();// 2nd
			pet.sleep();// 3rd
			
			pet.displayStatus();// final status
			System.out.println("--------------------------------------");
			
		}
	}
}
