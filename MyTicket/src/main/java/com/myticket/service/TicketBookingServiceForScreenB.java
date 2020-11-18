package com.myticket.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.myticket.models.movies.ScreenA;
import com.myticket.models.movies.ScreenB;
import com.myticket.models.movies.ShowMovie;

@Service
public class TicketBookingServiceForScreenB {

	private ScreenB screenB;
	@Autowired
	private Set<String> bookTickets;

	@Autowired
	@Lazy
	public TicketBookingServiceForScreenB(ScreenB screenB) {

		this.screenB = screenB;

	}

	public List<String> getAvailableSeats() {

		return screenB.ticketsAvailable();
	}

	public void bookTickets() {

		screenB.bookTicket(bookTickets);
		bookTickets.clear();

	}

	public void cancelTicket(String seatNumber) {

		screenB.cancelTicket(seatNumber);

	}
	
	public void setTicketsForBooking(Set<String> tickets) {

		this.bookTickets = tickets;
	}
}
