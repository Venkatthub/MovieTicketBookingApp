package com.myticket.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class LoginCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String email = request.getParameter("userEmail");
		String password = request.getParameter("userPassword");

		if (email.contentEquals("venkat.bca0@gmail.com") && password.contentEquals("asdf")) {

			HttpSession session = request.getSession();

			session.setAttribute("userEmail", email);

			return true;

		} else {

			response.setContentType("text/html");

			response.getWriter().print("Invalid credentials <br>");

			response.getWriter().print("<a href=\"/login\">Back to login</a>");

			return false;
		}
	}

}
