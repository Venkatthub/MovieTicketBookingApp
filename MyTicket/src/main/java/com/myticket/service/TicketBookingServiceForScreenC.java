package com.myticket.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.myticket.database.UserRepository;
import com.myticket.models.Ticket;
import com.myticket.models.movies.ScreenC;

@Service("screen3")
public class TicketBookingServiceForScreenC implements TicketBookingService {

	private ScreenC screenC;

	@Autowired
	private Ticket ticket;

	@Autowired
	private UserRepository database;

	@Autowired
	@Lazy
	public TicketBookingServiceForScreenC(ScreenC screenC) {

		this.screenC = screenC;

	}

	@Override
	public List<String> getAvailableSeats() {

		return screenC.ticketsAvailable();
	}

	@Override
	public void cancelTicket(String seatNumber) {

		screenC.cancelTicket(seatNumber);

	}

	@Override
	public void setTicketsForBooking(Set<String> ticketsToBook, String mailId) {

		screenC.bookTicket(ticketsToBook);

		ticket.setMovieName(screenC.getMovieName());

		ticket.setSeatNumber(ticketsToBook);

		ticket.setTotalCost(ticketsToBook.size());

		database.putTicket(mailId, ticketsToBook.toString(), ticket.getTotalCost(), ticket.getMovieName(),
				"Screen - C");
	}

}
