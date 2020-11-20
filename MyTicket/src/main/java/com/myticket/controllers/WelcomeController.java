package com.myticket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {

	@GetMapping
	public String indexPage() {

		return "index";

	}

	@RequestMapping("/login")
	public String loginPage(@ModelAttribute("message") String flashAttribute, Model model) {

		model.addAttribute("message", flashAttribute);

		return "login";

	}

	@RequestMapping("/signup")
	public String signupPage() {

		return "signup";

	}

}
