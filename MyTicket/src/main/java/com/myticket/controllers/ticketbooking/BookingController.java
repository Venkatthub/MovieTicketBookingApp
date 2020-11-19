package com.myticket.controllers.ticketbooking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/movies-myticket/book-ticket")
public class BookingController {

	@GetMapping
	public String setPathMapping(@RequestParam String screen, @CookieValue("User") String userName) {

		System.out.println(userName);
		System.out.println(screen);

		return "redirect:/movies/" + screen + "/" + userName + "/book";
	}

}
