package com.myticket.models;

import java.util.Set;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Ticket {

	private String movieName;
	private Set<String> seatNumbers;
	private long totalCost;
	private static final long TICKET_PRICE = 120;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Set<String> getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumber(Set<String> seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

	public long getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int seatCount) {
		this.totalCost = TICKET_PRICE * seatCount;
	}

}
