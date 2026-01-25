package addressBookSystem;
/*
 * 
 */

public class DigiContactApp {
	public static void main(String[] args) {
		AddressBook myBook = new AddressBook();
		System.out.println(" =========================================== ");
		System.out.println("---- WELCOME TO DIGICONTACT APP-----");
		System.out.println("---------------------------------------------");
		// Adding contacts
		myBook.addContact(
				new Contact("Harsh", "Singh", "123-456", "harsh@mail.com", new Address("Bhopal", "MP", "462001")));
		myBook.addContact(
				new Contact("Namrata", "Khapre", "987-654", "nammu@mail.com", new Address("Indore", "MP", "452001")));
		myBook.addContact(
				new Contact("Anand", "Raj", "555-000", "anand@mail.com", new Address("Bhopal", "MP", "462001")));

		// Try duplicate
		myBook.addContact(new Contact("Harsh", "Singh", "000-000", "a@a.com", null));

		// Display Sorted
		myBook.displayAllSorted();

		// Search
		myBook.searchByLocation("Bhopal");

		// Delete and Edit
		myBook.deleteContact("Anand Raj");
		myBook.editContact("Namrata Khapre", "111-222", "Nammusingh@mail.com");
	}
}
