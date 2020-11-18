package com.myticket.models;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Ticket {

	private String movieName;
	private Set<String> seatNumbers;
	private long price;

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
