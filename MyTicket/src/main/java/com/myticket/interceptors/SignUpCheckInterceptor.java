package com.myticket.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class SignUpCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String mailId = request.getParameter("userMail");

		if (mailId == "") {

			return true;

		} else {

			response.setContentType("text/html");
			response.getWriter().print("Mail id already registered");
			response.getWriter().print("<a href=\"/sign-up\">Back</a>");
			return false;

		}
	}

}
