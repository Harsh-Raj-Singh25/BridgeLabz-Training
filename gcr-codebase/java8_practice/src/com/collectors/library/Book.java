package com.collectors.library;

import java.util.*;
import java.util.stream.Collectors;

class Book {
	String title;
	String genre;
	int pages;

	Book(String title, String genre, int pages) {
		this.title = title;
		this.genre = genre;
		this.pages = pages;
	}

	public String getGenre() {
		return genre;
	}

	public int getPages() {
		return pages;
	}
}

