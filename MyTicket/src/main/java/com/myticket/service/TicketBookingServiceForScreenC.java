package com.myticket.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.myticket.models.movies.ScreenA;
import com.myticket.models.movies.ShowMovie;

@Service
public class TicketBookingServiceForScreenC {

	private ScreenA screenA;
	@Autowired
	private Set<String> bookTickets;

	@Autowired
	@Lazy
	public TicketBookingServiceForScreenA(ScreenA screenA) {

		this.screenA = screenA;

	}

	public List<String> getAvailableSeats() {

		return screenA.ticketsAvailable();
	}

	public void bookTickets() {

		screenA.bookTicket(bookTickets);
		bookTickets.clear();

	}

	public void cancelTicket(String seatNumber) {

		screenA.cancelTicket(seatNumber);

	}

	public void setTicketsForBooking(Set<String> tickets) {

		this.bookTickets = tickets;
	}
}
