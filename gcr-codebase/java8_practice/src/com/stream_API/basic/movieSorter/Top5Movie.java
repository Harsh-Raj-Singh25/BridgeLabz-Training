package com.stream_API.basic.movieSorter;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

class Movie {
	String title;
	double rating;
	int year;

	Movie(String t, double r, int y) {
		this.title = t;
		this.rating = r;
		this.year = y;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return title + " (" + year + ") - " + rating;
	}
}

public class Top5Movie {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(new Movie("Interstellar", 8.6, 2014), new Movie("Inception", 8.8, 2010),
				new Movie("The Dark Knight", 9.0, 2008), new Movie("Parasite", 8.6, 2019),
				new Movie("Avengers: Endgame", 8.4, 2019), new Movie("Joker", 8.4, 2019));

		List<Movie> top5 = movies.stream().filter(m -> m.year > 2000) // Filter by year
				.sorted(Comparator.comparing(Movie::getRating).reversed()) // Sort high to low
				.limit(5) // Short-circuit to 5
				.collect(Collectors.toList());

		top5.forEach(System.out::println);
	}
}