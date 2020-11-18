package com.myticket.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.myticket.models.movies.ScreenA;
import com.myticket.models.movies.ScreenB;
import com.myticket.models.movies.ScreenD;
import com.myticket.models.movies.ShowMovie;

@Service
public class TicketBookingServiceForScreenD {

	private ScreenD screenD;
	@Autowired
	private Set<String> bookTickets;

	@Autowired
	@Lazy
	public TicketBookingServiceForScreenD(ScreenD screenD) {

		this.screenD = screenD;

	}

	public List<String> getAvailableSeats() {

		return screenD.ticketsAvailable();
	}

	public void bookTickets() {

		screenD.bookTicket(bookTickets);
		bookTickets.clear();

	}

	public void cancelTicket(String seatNumber) {

		screenD.cancelTicket(seatNumber);

	}

	public void setTicketsForBooking(Set<String> tickets) {

		this.bookTickets = tickets;
	}

}
