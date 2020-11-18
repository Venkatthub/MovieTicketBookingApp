package com.myticket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookingController {

	@GetMapping("/movies-myticket/book-ticket")
	public String setPathMapping(@RequestParam String screen, @CookieValue("User") String userName) {

		if (screen.contentEquals("screen-a")) {

			return "forward:/movies/screen-a/" + userName;

		} else if (screen.contentEquals("screen-b")) {

			return "forward:/movies/screen-b/" + userName;

		} else if (screen.contentEquals("screen-c")) {

			return "forward:/movies/screen-c/" + userName;

		} else {

			return "forward:/movies/screen-d/" + userName;
		}

//		return "redirect:/home/" + userName + "/" + movieName + "/book-ticket";
	}

}
