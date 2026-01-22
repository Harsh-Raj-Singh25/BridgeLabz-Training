package com.day9_BST.musicApp;

public class MusicAppMain {
	public static void main(String[] args) {
		MusicLibraryBST myLibrary = new MusicLibraryBST();

		// Adding songs
		myLibrary.insert(105, "Babuan", "Pawan Singh");
		myLibrary.insert(102, "Khatola", "Masoom Sharma");
		myLibrary.insert(110, "Holi", "Ritik Singh");
		myLibrary.insert(101, "Munda Rajput", "Raahi Raana");

		// Search
		int searchId = 101;
		Song found = myLibrary.search(searchId);
		if (found != null) {
			System.out.println(" Found Song: " + found.title + " by " + found.artist);
		} else {
			System.out.println(" Song with ID " + searchId + " not found.");
		}

		// Show Playlist
		myLibrary.displayPlaylist();
	}
}
