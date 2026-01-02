package com.Encapsulation_Polymorphism_Interface_AbstractClass.LibraryManagementSystem;

//Interface for items that can be reserved
interface Reservable {
	void reserveItem(String borrowerName);
	boolean checkAvailability();
}
