package PetPalApp;

abstract class Pet implements IInteractable {
	String name;
	private String type;
	private int age;
	// Internal states
	private int hungerLevel;
	private int moodLevel;
	private int energy;

	// constructor
	Pet(String name, String type, int age ) {
		this.name = name;
		this.age = age;
		this.type = type;
		this.hungerLevel = 50;  // low=0 && highest=100
		this.moodLevel =50;
		this.energy =50;
	}

	public String getType() {
		return type;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// PROTECTED METHODS: Allow subclasses to modify state through logic
	protected void updateHunger(int amount) {
		this.hungerLevel += amount;
	}

	protected void updateMood(int amount) {
		this.moodLevel += amount;
	}

	protected void updateEnergy(int amount) {
		this.energy += amount;
	}

	public void displayStatus() {
		System.out
				.println("Hunger:" + hungerLevel + "/100 | Mood : " + moodLevel + "/100 | Energy:" + energy + "/100 ");
	}

	// abstract method for pet's sound.
	abstract void makeSound();

}
