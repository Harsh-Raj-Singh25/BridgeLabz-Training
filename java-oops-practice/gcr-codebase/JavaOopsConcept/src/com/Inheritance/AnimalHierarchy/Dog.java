package com.Inheritance.AnimalHierarchy;

class Dog extends Animal {
	// overriding the makeSound() method
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}
