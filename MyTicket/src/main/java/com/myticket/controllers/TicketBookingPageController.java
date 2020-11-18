package com.myticket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class TicketBookingPageController {

	@ModelAttribute
	public void setModelAttributes(@CookieValue("User") String userName, Model model) {

		model.addAttribute("userName", userName);

	}

	@RequestMapping("/home/{userName}/{movieName}/book-ticket")
	public String setMovieName(@PathVariable String movieName, Model model) {

		model.addAttribute("movie", movieName);

		return "forward:/booking";

	}

	@RequestMapping("/booking")
	public ModelAndView getBookingPage() {

		ModelAndView model = new ModelAndView("bookingPage");

		return model;

	}

}
