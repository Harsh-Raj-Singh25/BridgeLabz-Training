package com.annotations.builtIn.override;

class Dog extends Animal {
	//  Using @Override to ensure the signature matches the parent
	@Override
	public void makeSound() {
		System.out.println("The dog barks: Woof! Woof!");
	}
}
