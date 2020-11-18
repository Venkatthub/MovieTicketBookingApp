package com.myticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myticket.service.TicketBookingServiceForScreenC;

@Controller
@RequestMapping("/movies/screen-c")
public class ScreenCBookingController {

	@Autowired
	private TicketBookingServiceForScreenC service;

	@RequestMapping("/${userName}")
	public String screenABooking() {

		
		return "";
		
	}
	
	

}
