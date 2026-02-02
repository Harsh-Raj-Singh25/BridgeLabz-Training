package com.functional_interface.marker_interfaces.cloning_prototype;

public class PrototypeFactory {
	public static void main(String[] args) {
		try {
			PrototypeModel p1 = new PrototypeModel("Tesla-V1");
			// Cloning p1 to create p2
			PrototypeModel p2 = (PrototypeModel) p1.clone();

			p1.display();
			p2.display();
			System.out.println("Object successfully cloned.");
		} catch (CloneNotSupportedException e) {
			System.out.println(" Cloning not allowed.");
		}
	}
}