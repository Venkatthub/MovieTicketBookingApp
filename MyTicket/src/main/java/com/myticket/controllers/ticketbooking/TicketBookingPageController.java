package com.myticket.controllers.ticketbooking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TicketBookingPageController {

	@RequestMapping("/home/{userName}/{movieName}/{screenName}/book-ticket")
	public String setMovieName(@PathVariable String movieName, @PathVariable String screenName,
			@PathVariable String userName, Model model) {

		model.addAttribute("screen", screenName.toUpperCase());
		model.addAttribute("movie", movieName);
		model.addAttribute("user", userName);

		return "forward:/booking";

	}

	@RequestMapping("/booking")
	public ModelAndView getBookingPage() {

		return new ModelAndView("bookingPage");

	}

}
