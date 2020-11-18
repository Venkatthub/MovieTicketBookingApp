package com.myticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myticket.service.TicketBookingServiceForScreenB;

@Controller
@RequestMapping("/movies/screen-b")
public class ScreenBBookingController {
	
	@Autowired
	private TicketBookingServiceForScreenB service;

	@RequestMapping("/${userName}")
	public String screenABooking() {

		return "";
		
	}

	
	
}
