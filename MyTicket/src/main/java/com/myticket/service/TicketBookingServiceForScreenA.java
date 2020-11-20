package com.myticket.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.myticket.database.UserRepository;
import com.myticket.models.Ticket;
import com.myticket.models.movies.ScreenA;

@Service("screen1")
public class TicketBookingServiceForScreenA implements TicketBookingService {

	private ScreenA screenA;
	
	@Autowired
	private Ticket ticket;

	@Autowired
	private UserRepository database;

	@Autowired
	@Lazy
	public TicketBookingServiceForScreenA(ScreenA screenA) {

		this.screenA = screenA;

	}

	@Override
	public List<String> getAvailableSeats() {

		return screenA.ticketsAvailable();
	}

	@Override
	public void cancelTicket(String seatNumber) {

		screenA.cancelTicket(seatNumber);

	}

	@Override
	public void setTicketsForBooking(Set<String> ticketsToBook, String mailId) {

		screenA.bookTicket(ticketsToBook);

		ticket.setMovieName(screenA.getMovieName());

		ticket.setSeatNumber(ticketsToBook);

		ticket.setTotalCost(ticketsToBook.size());

		database.putTicket(mailId, ticketsToBook.toString(), ticket.getTotalCost(), ticket.getMovieName(),
				"Screen - A");

	}

}
