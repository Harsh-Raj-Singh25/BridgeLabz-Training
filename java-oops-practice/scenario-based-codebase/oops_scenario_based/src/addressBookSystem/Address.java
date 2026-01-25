package addressBookSystem;

import java.util.*;
import java.util.stream.Collectors;

// Composition: Address as a separate class
class Address {
	private String city, state, zip;

	public Address(String city, String state, String zip) {
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	// Getters for search functionality
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return city + ", " + state + " " + zip;
	}
}

