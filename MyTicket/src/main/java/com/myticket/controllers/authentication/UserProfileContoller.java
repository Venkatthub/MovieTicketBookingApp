package com.myticket.controllers.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.myticket.service.UserService;

@Controller
@RequestMapping("/profile")
public class UserProfileContoller {

	@Autowired
	private UserService userService;

	@GetMapping
	public ModelAndView getUserProfilePage(@CookieValue String user, @CookieValue String email) {

		ModelAndView model = new ModelAndView("profilePage");
		model.addObject("password", userService.getUserPassword(email));
		model.addObject("userName", user);
		model.addObject("userEmail", email);

		return model;

	}

}
