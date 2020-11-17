package com.myticket.models;

import java.util.Set;

import com.myticket.models.movies.Movie;

public class Ticket {

	private Movie movie;
	private Set<String> seatNumbers;
	private long price;

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Set<String> getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumber(Set<String> seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
