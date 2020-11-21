package com.myticket.controllers.restcontrollers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
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

	@PostMapping(value = "/{emailId}/{movieName}/screen-a", consumes = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String bookSeatInA(@RequestBody Set<String> ticketsToBook, @PathVariable String emailId) {

		serviceA.setTicketsForBooking(ticketsToBook, emailId);

		return "Ticket Booked";
	}

	@PostMapping(value = "/{emailId}/{movieName}/screen-b", consumes = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String bookSeatInB(@RequestBody Set<String> ticketsToBook, @PathVariable String emailId) {

		serviceB.setTicketsForBooking(ticketsToBook, emailId);

		return "Ticket Booked";

	}

	@PostMapping(value = "/{emailId}/{movieName}/screen-c", consumes = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String bookSeatInC(@RequestBody Set<String> ticketsToBook, @PathVariable String emailId) {

		serviceC.setTicketsForBooking(ticketsToBook, emailId);

		return "Ticket Booked";

	}

	@PostMapping(value = "/{emailId}/{movieName}/screen-d", consumes = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String bookSeatInD(@RequestBody Set<String> ticketsToBook, @PathVariable String emailId) {

		serviceD.setTicketsForBooking(ticketsToBook, emailId);

		return "Ticket Booked";

	}

}
