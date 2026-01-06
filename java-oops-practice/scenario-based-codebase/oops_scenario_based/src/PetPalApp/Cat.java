package PetPalApp;

public class Cat extends Pet {
	public Cat(String name, int age){
		super(name, "Cat", age);
	}
	
	@Override
	void makeSound() {
		System.out.println(name+"Meowwwwwwww");
	}
	
	@Override
	public void feed() {
		System.out.println("Feeding the "+name+"some milk");
		updateHunger(-30); // decrease in hunger 
		updateEnergy(25); // increase in energy
		updateMood(20);// increase in mood
	}
	@Override
	public void play() {
		System.out.println("The "+name+" has started playing");
		updateHunger(30);
		updateMood(5);
		updateEnergy(-10);
	}
	@Override
	public void sleep() {
		System.out.println("The "+name+" is now sleeping");
		updateEnergy(50);
		updateMood(25);
		updateHunger(25);
	}
	

}
