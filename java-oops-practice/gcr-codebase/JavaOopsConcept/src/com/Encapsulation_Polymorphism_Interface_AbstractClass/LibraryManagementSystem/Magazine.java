package com.Encapsulation_Polymorphism_Interface_AbstractClass.LibraryManagementSystem;

class Magazine extends LibraryItem {
	public Magazine(String id, String title, String author) {
		super(id, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 7;
	} // Magazines allowed for 7 days
}