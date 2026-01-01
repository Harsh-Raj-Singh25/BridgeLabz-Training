package com.Inheritance.AnimalHierarchy;

public class Bird extends Animal{
	// overriding the makeSound() method
	@Override
	void makeSound() {
		System.out.println("Bird chirps");
	}
}
