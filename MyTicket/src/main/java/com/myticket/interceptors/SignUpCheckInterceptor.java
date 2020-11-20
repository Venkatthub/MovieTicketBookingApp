package com.myticket.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.myticket.database.UserRepository;

public class SignUpCheckInterceptor extends HandlerInterceptorAdapter {

	private UserRepository userRepository = new UserRepository();

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String mailId = request.getParameter("userMail");

		if (!userRepository.checkEmailAlreadyExists(mailId)) {

			return true;

		} else {

			response.setContentType("text/html");

			response.getWriter().print("Mail id already registered");

			response.getWriter().print("<a href=\"/sign-up\">Back</a>");

			response.setStatus(209);

			return false;

		}
	}

}
