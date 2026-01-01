package com.Inheritance.AnimalHierarchy;

class Cat extends Animal{
	// overriding the makeSound() method
	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
}
