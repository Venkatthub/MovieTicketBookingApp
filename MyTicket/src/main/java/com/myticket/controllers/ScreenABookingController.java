package com.myticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myticket.service.TicketBookingServiceForScreenA;

@Controller
@RequestMapping("/movies/screen-b")
public class ScreenABookingController {

	@Autowired
	private TicketBookingServiceForScreenA service;

	@RequestMapping("/${userName}")
	public String screenABooking() {

		return "";
		
	}

}
