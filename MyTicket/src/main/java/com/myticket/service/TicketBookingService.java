package com.myticket.service;

import java.util.List;
import java.util.Set;

public interface TicketBookingService {

	List<String> getAvailableSeats();

	void cancelTicket(String seatNumber);

	void setTicketsForBooking(Set<String> ticketsToBook, String mailId);

}
