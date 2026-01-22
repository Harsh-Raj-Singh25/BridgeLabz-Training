package com.day9_BST.musicApp;

public class MusicLibraryBST {
	Song root;

	//  Scenario 2: Insert New Track
	public void insert(int id, String title, String artist) {
		root = insertRecursive(root, id, title, artist);
	}

	private Song insertRecursive(Song root, int id, String title, String artist) {
		if (root == null) {
			return new Song(id, title, artist);
		}

		if (id < root.trackID) {
			root.left = insertRecursive(root.left, id, title, artist);
		} else if (id > root.trackID) {
			root.right = insertRecursive(root.right, id, title, artist);
		}
		return root;
	}

	//  Scenario 1: Search Track by ID
	public Song search(int id) {
		return searchRecursive(root, id);
	}

	private Song searchRecursive(Song root, int id) {
		// Base Case: ID not found or found at root
		if (root == null || root.trackID == id) {
			return root;
		}

		// Search Left or Right
		if (id < root.trackID) {
			return searchRecursive(root.left, id);
		}
		return searchRecursive(root.right, id);
	}

	//  Scenario 3: Display Playlist (Numeric order by ID)
	public void displayPlaylist() {
		System.out.println("\n---  Your Music Library (Sorted by ID) ---");
		inOrder(root);
	}

	private void inOrder(Song root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println("ID: " + root.trackID + " | Song: " + root.title + " | Artist: " + root.artist);
			inOrder(root.right);
		}
	}
}
