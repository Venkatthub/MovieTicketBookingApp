package com.myticket.controllers.authentication;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LogoutController {

	@GetMapping("/logout")
	public RedirectView logoutUser(HttpServletRequest request, RedirectAttributes model) {

		HttpSession session = request.getSession(false);

		session.invalidate();

		Cookie[] cookies = request.getCookies();

		for (Cookie cookie : cookies) {

			if (cookie.getName().equalsIgnoreCase("JSESSIONID") || cookie.getName().equalsIgnoreCase("User")
					|| cookie.getName().equalsIgnoreCase("email")) {

				cookie.setMaxAge(0);

			}
		}

		model.addAttribute("message", "Logged out successfully");

		return new RedirectView("/login");
	}

}
