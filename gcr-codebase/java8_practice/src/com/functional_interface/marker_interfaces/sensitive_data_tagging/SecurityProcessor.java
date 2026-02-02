package com.functional_interface.marker_interfaces.sensitive_data_tagging;

public class SecurityProcessor {
	public static void process(Object obj) {
		// Checking the "Tag" using instanceof
		if (obj instanceof Encrypted) {
			System.out.println(" Sensitive Data Found: Encrypting " + obj.getClass().getSimpleName() + "...");
		} else {
			System.out.println(" Public Data: Processing " + obj.getClass().getSimpleName() + " normally.");
		}
	}

	public static void main(String[] args) {
		process(new UserPassword());
		process(new PublicComment());
	}
}