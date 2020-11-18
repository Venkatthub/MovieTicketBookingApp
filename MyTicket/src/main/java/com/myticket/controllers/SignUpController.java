package com.myticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.myticket.models.UserProfile;
import com.myticket.service.UserService;

@Controller
@RequestMapping("/sign-up/user")
public class SignUpController {

	@Autowired
	private UserService userService;

	@PostMapping
	public RedirectView signUp(@ModelAttribute UserProfile user, RedirectAttributes model) {

		userService.createUser(user);

		model.addFlashAttribute("message", "Account Created ! Please login to continue.");

		return new RedirectView("/login");

	}
}
