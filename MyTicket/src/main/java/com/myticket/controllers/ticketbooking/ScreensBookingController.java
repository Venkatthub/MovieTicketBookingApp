package com.myticket.controllers.ticketbooking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myticket.models.movies.ScreenA;
import com.myticket.models.movies.ScreenB;
import com.myticket.models.movies.ScreenC;
import com.myticket.models.movies.ScreenD;

@Controller
@RequestMapping("/movies")
public class ScreensBookingController {

	@RequestMapping("/screen-a/{userName}/book")
	public String screenABooking(@PathVariable String userName) {

		System.out.println("screen A");

		return "redirect:/home/" + userName + "/" + ScreenA.movieName + "/screen-a/book-ticket";

	}

	@GetMapping("/screen-b/{userName}/book")
	public String screenBBooking(@PathVariable String userName) {

		System.out.println("screen B");

		return "redirect:/home/" + userName + "/" + ScreenB.movieName + "/screen-b/book-ticket";

	}

	@RequestMapping("/screen-c/{userName}/book")
	public String screenCBooking(@PathVariable String userName) {

		System.out.println("screen C");

		return "redirect:/home/" + userName + "/" + ScreenC.movieName + "/screen-c/book-ticket";

	}

	@RequestMapping("/screen-d/{userName}/book")
	public String screenDBooking(@PathVariable String userName) {

		System.out.println("screen d");

		return "redirect:/home/" + userName + "/" + ScreenD.movieName + "/screen-d/book-ticket";

	}

}
