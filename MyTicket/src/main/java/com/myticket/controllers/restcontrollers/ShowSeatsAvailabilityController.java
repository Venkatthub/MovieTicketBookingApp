package com.myticket.controllers.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.myticket.service.TicketBookingService;

@RestController
@RequestMapping("/my-ticket/movies")
public class ShowSeatsAvailabilityController {

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

	@GetMapping(value = "{movie}/screen-a/available-seats", produces = "application/json")
	public String[] seatsAvailabilityScreenA() {

		return serviceA.getAvailableSeats().toArray(new String[0]);

	}

	@GetMapping(value = "{movie}/screen-b/available-seats", produces = "application/json")
	public String[] seatsAvailabilityScreenB() {

		return serviceB.getAvailableSeats().toArray(new String[0]);

	}

	@GetMapping(value = "{movie}/screen-c/available-seats", produces = "application/json")
	public String[] seatsAvailabilityScreenC() {

		return serviceC.getAvailableSeats().toArray(new String[0]);

	}

	@GetMapping(value = "{movie}/screen-d/available-seats", produces = "application/json")
	public String[] seatsAvailabilityScreenD(@PathVariable String movie) {

		return serviceD.getAvailableSeats().toArray(new String[0]);

	}

}
