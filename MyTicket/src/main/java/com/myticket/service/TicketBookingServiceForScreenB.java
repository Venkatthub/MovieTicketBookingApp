package com.myticket.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.myticket.database.UserRepository;
import com.myticket.models.Ticket;
import com.myticket.models.movies.ScreenB;

@Service("screen2")
public class TicketBookingServiceForScreenB implements TicketBookingService {

	private ScreenB screenB;

	@Autowired
	private Ticket ticket;

	@Autowired
	private UserRepository database;

	@Autowired
	public TicketBookingServiceForScreenB(ScreenB screenB) {

		this.screenB = screenB;
	}

	@Override
	public List<String> getAvailableSeats() {

		return screenB.ticketsAvailable();
	}

	@Override
	public void cancelTicket(String seatNumber) {

		screenB.cancelTicket(seatNumber);

	}

	@Override
	public void setTicketsForBooking(Set<String> ticketsToBook, String mailId) {

		screenB.bookTicket(ticketsToBook);

		ticket.setMovieName(screenB.getMovieName());

		ticket.setSeatNumber(ticketsToBook);

		ticket.setTotalCost(ticketsToBook.size());

		database.putTicket(mailId, ticketsToBook.toString(), ticket.getTotalCost(), ticket.getMovieName(),
				"Screen - B");
	}

}
