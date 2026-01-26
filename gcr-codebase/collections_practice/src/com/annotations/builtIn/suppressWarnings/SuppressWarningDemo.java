package com.annotations.builtIn.suppressWarnings;

import java.util.*;

public class SuppressWarningDemo {
	// Tell the compiler we know what we are doing with raw types
	@SuppressWarnings("unchecked")
	public void addElements() {
		// Using ArrayList without Generics (Raw Type)
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add(100);

		System.out.println("List elements: " + list);
	}

	public static void main(String[] args) {
		new SuppressWarningDemo().addElements();
	}
}