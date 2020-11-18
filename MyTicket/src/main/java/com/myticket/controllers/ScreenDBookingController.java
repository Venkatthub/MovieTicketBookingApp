package com.myticket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies/screen-d")
public class ScreenDBookingController {

	@RequestMapping("/${userName}")
	public String screenABooking() {

		return "";
		
	}
}
