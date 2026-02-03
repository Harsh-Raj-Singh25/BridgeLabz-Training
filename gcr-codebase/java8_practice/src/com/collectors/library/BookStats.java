package com.collectors.library;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookStats {
	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book("Hobbit", "Fantasy", 310), new Book("Harry Potter", "Fantasy", 500),
				new Book("Dracula", "Horror", 418), new Book("The Shining", "Horror", 447));

		Map<String, IntSummaryStatistics> statsByGenre = books.stream()
				.collect(Collectors.groupingBy(Book::getGenre, Collectors.summarizingInt(Book::getPages)));

		statsByGenre.forEach((genre, stats) -> {
			System.out.println("--- " + genre + " ---");
			System.out.println("Total Pages: " + stats.getSum());
			System.out.println("Average Pages: " + stats.getAverage());
			System.out.println("Max Pages: " + stats.getMax());
		});
	}
	
	
	
}