package com.myticket.controllers.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myticket.service.UserService;

@RestController
@RequestMapping("/my-ticket/users/{userEmail}/tickets")
public class DisplayUserTicketController {

	@Autowired
	UserService userService;

	@GetMapping(produces = "application/json")
	public String getUserTicketDetails(@PathVariable String userEmail) {

		return userService.getTicketDetails(userEmail);

	}

}
