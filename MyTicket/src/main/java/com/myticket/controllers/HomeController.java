package com.myticket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

	@PostMapping("/users")
	public RedirectView homePage(@SessionAttribute String userName, @RequestParam String userEmail,
			RedirectAttributes object) {

		object.addFlashAttribute("emailId", userEmail);

		return new RedirectView("/home/" + userName);
	}

	@RequestMapping(value = "/home/{userName}")
	public String getHomePage(@PathVariable String userName, @ModelAttribute String emailId) {

		return "forward:/home";

	}

	@RequestMapping("/home")
	public String getHome() {

		return "home";
	}

}
