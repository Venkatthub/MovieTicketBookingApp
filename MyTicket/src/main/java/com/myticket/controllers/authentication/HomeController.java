package com.myticket.controllers.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

	@PostMapping("/users")
	public RedirectView redirectToHomePage(@SessionAttribute String userName, @RequestParam String userEmail,
			RedirectAttributes object) {

		object.addFlashAttribute("emailId", userEmail);

		return new RedirectView("/home/" + userName);
	}

	@RequestMapping(value = "/home/{userName}")
	public String goToHomePage() {

		return "forward:/home";

	}

	@RequestMapping("/home")
	public String getHomePage(Model model, @CookieValue String email) {

		model.addAttribute("user", email);
		return "home";
	}

}
