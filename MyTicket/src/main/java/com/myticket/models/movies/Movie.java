package com.myticket.models.movies;

public abstract class Movie {

	private String movieName;
	private String description;

	public Movie(String movieName, String description) {

		this.movieName = movieName;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String getMovieName() {
		return movieName;
	}
}
