package addressBookSystem;


class Contact {
	private String firstName, lastName, phone, email;
	private Address address; // Has-a relationship

	public Contact(String firstName, String lastName, String phone, String email, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	// Getters for Sorting and Searching
	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address;
	}

	// Setters for Editing
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("Name: %-15s | Phone: %-12s | Email: %-20s | Address: %s", getFullName(), phone, email,
				address);
	}
}
