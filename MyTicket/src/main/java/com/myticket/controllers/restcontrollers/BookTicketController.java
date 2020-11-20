package com.myticket.controllers.restcontrollers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.myticket.service.TicketBookingService;

@RestController
@RequestMapping("/my-ticket/confirm-booking")
public class BookTicketController {

	@Autowired
	@Qualifier("screen1")
	private TicketBookingService serviceA;

	@Autowired
	@Qualifier("screen2")
	private TicketBookingService serviceB;

	@Autowired
	@Qualifier("screen3")
	private TicketBookingService serviceC;

	@Autowired
	@Qualifier("screen4")
	private TicketBookingService serviceD;

	@PostMapping(value = "/{movieName}/screen-a", consumes = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String bookSeatInA(@RequestBody Set<String> ticketsToBook, @CookieValue String email) {

		serviceA.setTicketsForBooking(ticketsToBook, email);

		return "Ticket Booked";
	}

	@PostMapping(value = "/{movieName}/screen-b", consumes = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String bookSeatInB(@RequestBody Set<String> ticketsToBook, @CookieValue String email) {

		serviceB.setTicketsForBooking(ticketsToBook, email);

		return "Ticket Booked";

	}

	@PostMapping(value = "/{movieName}/screen-c", consumes = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String bookSeatInC(@RequestBody Set<String> ticketsToBook, @CookieValue String email) {

		serviceC.setTicketsForBooking(ticketsToBook, email);

		return "Ticket Booked";

	}

	@PostMapping(value = "/{movieName}/screen-d", consumes = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String bookSeatInD(@RequestBody Set<String> ticketsToBook, @CookieValue String email) {

		serviceD.setTicketsForBooking(ticketsToBook, email);

		return "Ticket Booked";

	}

}
