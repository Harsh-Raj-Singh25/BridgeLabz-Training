package com.constructor.level1;

public class BookLibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookLibrary book1 = new BookLibrary("Chola Tigers", "Amish", 570);
        book1.displayDetails();
        System.out.println();

        book1.borrowBook();
        book1.displayDetails();
        System.out.println();

        book1.returnBook();
        book1.displayDetails();
	}

}
