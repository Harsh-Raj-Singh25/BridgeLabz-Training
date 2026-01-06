package PetPalApp;

class Dog extends Pet {
	public Dog(String name, int age){
		super(name, "DOG", age);
	}
	
	@Override
	void makeSound() {
		System.out.println(name+"Dog barks");
	}
	
	@Override
	public void feed() {
		System.out.println("Feeding the "+name+"some biscuits");
		updateHunger(-20);
		updateEnergy(5);
		updateMood(10);
	}
	@Override
	public void play() {
		System.out.println("The "+name+" has started playing");
		updateHunger(20);
		updateMood(20);
		updateEnergy(-15);
	}
	@Override
	public void sleep() {
		System.out.println("The "+name+" is now sleeping");
		updateEnergy(50);
		updateMood(10);
		updateHunger(25);
	}
}
