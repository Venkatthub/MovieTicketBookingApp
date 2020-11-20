package com.myticket.controllers.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import com.myticket.service.UserService;

@Controller
public class UserProfileContoller {

	@Autowired
	private UserService userService;

	@RequestMapping("/my-ticket/user-profile")
	public String goToUserProfilePage() {

		return "forward:/userProfile";
	}

	@RequestMapping("/userProfile")
	public String getUserProfilePage(Model model, @CookieValue String user, @CookieValue String email) {

		model.addAttribute("password", userService.getUserPassword(email));
		model.addAttribute("userName", user);
		model.addAttribute("userEmail", email);

		return "/userProfile";

	}

}
