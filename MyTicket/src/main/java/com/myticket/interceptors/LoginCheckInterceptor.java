package com.myticket.interceptors;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.myticket.database.UserRepository;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {

	private UserRepository userRepository = new UserRepository();

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String email = request.getParameter("userEmail");

		String password = request.getParameter("userPassword");

		if (userRepository.validateCredentials(email, password)) {

			String userName = userRepository.retriveUserName(email);

			HttpSession session = request.getSession();

			Cookie userNameCookie = new Cookie("user", userName);

			Cookie userEmailCookie = new Cookie("email", email);

			userNameCookie.setMaxAge(60 * 60);

			userEmailCookie.setMaxAge(60 * 60);

			response.addCookie(userNameCookie);

			response.addCookie(userEmailCookie);

			session.setAttribute("userName", userName);

			return true;

		} else {

			response.setContentType("text/html");

			response.getWriter().print("Invalid credentials <br>");

			response.getWriter().print("<a href=\"/login\">Back to login</a>");

			return false;
		}
	}

}
