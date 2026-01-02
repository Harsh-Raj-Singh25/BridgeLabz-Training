package com.Encapsulation_Polymorphism_Interface_AbstractClass.LibraryManagementSystem;

//Abstract Superclass
abstract class LibraryItem {
	private String itemId;
	private String title;
	private String author;
	private boolean isAvailable = true;

	public LibraryItem(String itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}

	// Encapsulation
	public String getTitle() {
		return title;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	protected void setAvailable(boolean status) {
		this.isAvailable = status;
	}

	// Abstract method: Loan duration varies by item type
	public abstract int getLoanDuration();

	// Concrete method
	public void getItemDetails() {
		System.out.println("[" + itemId + "] " + title + " by " + author);
	}
}



