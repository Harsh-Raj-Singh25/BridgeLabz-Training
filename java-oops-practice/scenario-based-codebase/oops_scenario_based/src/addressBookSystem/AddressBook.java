package addressBookSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class AddressBook {
	private List<Contact> contacts = new ArrayList<>();

	//  Add Contact with Duplicate Validation
	public void addContact(Contact newContact) {
		boolean isDuplicate = contacts.stream()
				.anyMatch(c -> c.getFullName().equalsIgnoreCase(newContact.getFullName()));

		if (isDuplicate) {
			System.out.println(" Error: Contact '" + newContact.getFullName() + "' already exists.");
		} else {
			contacts.add(newContact);
			System.out.println(" Contact added successfully.");
		}
	}

	// 2. Edit Contact by Name
	public void editContact(String fullName, String newPhone, String newEmail) {
		for (Contact c : contacts) {
			if (c.getFullName().equalsIgnoreCase(fullName)) {
				c.setPhone(newPhone);
				c.setEmail(newEmail);
				System.out.println(" Contact updated.");
				return;
			}
		}
		System.out.println("❓ Contact not found.");
	}

	// 3. Delete Contact by Name
	public void deleteContact(String fullName) {
		boolean removed = contacts.removeIf(c -> c.getFullName().equalsIgnoreCase(fullName));
		if (removed)
			System.out.println(" Contact deleted.");
		else
			System.out.println(" Contact not found.");
	}

	// 4. Search by City or State
	public void searchByLocation(String location) {
		System.out.println("\n--- Search Results for: " + location + " ---");
		List<Contact> results = contacts.stream().filter(c -> c.getAddress().getCity().equalsIgnoreCase(location)
				|| c.getAddress().getState().equalsIgnoreCase(location)).collect(Collectors.toList());

		if (results.isEmpty())
			System.out.println("No contacts found in this location.");
		else
			results.forEach(System.out::println);
	}

	// 5. Display Sorted Alphabetically
	public void displayAllSorted() {
		System.out.println("\n--- All Contacts (A-Z) ---");
		contacts.stream().sorted(Comparator.comparing(Contact::getFirstName).thenComparing(Contact::getLastName))
				.forEach(System.out::println);
	}
}
