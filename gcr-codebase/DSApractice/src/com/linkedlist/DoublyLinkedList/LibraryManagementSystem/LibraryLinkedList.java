package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

class LibraryLinkedList {
	private BookNode head;
	private BookNode tail;
	private int bookCount = 0;

	// Add : at the beginning:
	public void insertAtHead(int id, String title, String author, String genre) {
		BookNode newNode = new BookNode(id, title, author, genre);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		System.out.println("Book added at beginning");
		bookCount++;
	}

	// ADD: At the End
	public void insertAtEnd(int id, String title, String author, String genre) {
		BookNode newNode = new BookNode(id, title, author, genre);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		System.out.println("Book added at the end");
		bookCount++;
	}

	// REMOVE: By Book ID
	public void removeBook(int id) {
		BookNode current = head;
		while (current != null) {
			if (current.bookId == id) {
				if (current == head) {
					head = head.next;
					if (head != null)
						head.prev = null;
				} else if (current == tail) {
					tail = tail.prev;
					if (tail != null)
						tail.next = null;
				} else {
					current.prev.next = current.next;
					current.next.prev = current.prev;
				}
				bookCount--;
				System.out.println("Book ID " + id + " removed successfully.");
				return;
			}
			current = current.next;
		}
		System.out.println("Book ID not found.");
	}

	// SEARCH: By Title or Author
	public void search(String query) {
		BookNode current = head;
		boolean found = false;
		while (current != null) {
			if (current.title.equalsIgnoreCase(query) || current.author.equalsIgnoreCase(query)) {
				System.out.println("Found: [" + current.bookId + "] " + current.title + " by " + current.author);
				found = true;
			}
			current = current.next;
		}
		if (!found)
			System.out.println("No match found for: " + query);
	}

	// UPDATE: Availability Status
	public void updateStatus(int id, boolean status) {
		BookNode current = head;
		while (current != null) {
			if (current.bookId == id) {
				current.isAvailable = status;
				System.out.println("Status updated for: " + current.title);
				return;
			}
			current = current.next;
		}
	}

	// DISPLAY: Forward and Reverse
	public void displayForward() {
		System.out.println("\n--- Library Catalog (A-Z) ---");
		BookNode temp = head;
		while (temp != null) {
			String status = temp.isAvailable ? "Available" : "Borrowed";
			System.out.println(temp.bookId + " | " + temp.title + " | " + status);
			temp = temp.next;
		}
	}

	public void displayReverse() {
		System.out.println("\n--- Library Catalog (Z-A) ---");
		BookNode temp = tail;
		while (temp != null) {
			System.out.println(temp.bookId + " | " + temp.title);
			temp = temp.prev;
		}
	}

	public int getTotalBooks() {
		return bookCount;
	}
}