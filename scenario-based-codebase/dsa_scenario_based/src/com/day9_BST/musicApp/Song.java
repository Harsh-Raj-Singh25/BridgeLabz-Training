package com.day9_BST.musicApp;

class Song {
	int trackID;
	String title;
	String artist;
	Song left, right;

	Song(int trackID, String title, String artist) {
		this.trackID = trackID;
		this.title = title;
		this.artist = artist;
		this.left = this.right = null;
	}
}


	