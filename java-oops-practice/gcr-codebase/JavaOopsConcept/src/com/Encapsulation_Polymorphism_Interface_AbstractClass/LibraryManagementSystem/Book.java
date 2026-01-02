package com.Encapsulation_Polymorphism_Interface_AbstractClass.LibraryManagementSystem;

class Book extends LibraryItem implements Reservable {
	private String borrowerData; // Encapsulated personal data

	public Book(String id, String title, String author) {
		super(id, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 21;
	} // Books allowed for 21 days

	@Override
	public void reserveItem(String name) {
		if (isAvailable()) {
			this.borrowerData = name;
			setAvailable(false);
			System.out.println("Book '" + getTitle() + "' reserved for " + name);
		}
	}

	@Override
	public boolean checkAvailability() {
		return isAvailable();
	}
}