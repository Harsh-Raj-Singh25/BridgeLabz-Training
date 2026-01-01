package com.Inheritance.AnimalHierarchy;

public class Main {
	public static void main(String[] args) {
		// making objects of each class
		Animal animal=new Animal();
		Dog dog= new Dog();
		Bird bird=new Bird();
		Cat cat=new Cat();
		
		// calling methods of each class
		animal.makeSound();
		dog.makeSound();
		bird.makeSound();
		cat.makeSound();
	}
}
