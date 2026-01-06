package PetPalApp;

public class Bird extends Pet {
	Bird(String name, int age){
		super(name, "Cat", age);
	}
	
	@Override
	void makeSound() {
		System.out.println(name+"Chirps");
	}
	
	@Override
	public void feed() {
		System.out.println("Feeding the "+name+"some nuts");
		updateHunger(-50);
		updateEnergy(50);
		updateMood(15);
	}
	@Override
	public void play() {
		System.out.println("The "+name+" is diving in water");
		updateHunger(50);
		updateMood(10);
		updateEnergy(-60);
	}
	@Override
	public void sleep() {
		System.out.println("The "+name+" is now sleeping in its nest");
		updateEnergy(50);
		updateMood(25);
		updateHunger(15);
	}
}
