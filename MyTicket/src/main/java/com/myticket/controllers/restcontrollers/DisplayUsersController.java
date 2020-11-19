package com.myticket.controllers.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myticket.service.UserService;

@RestController
@RequestMapping("/my-ticket/users/")
public class DisplayUsersController {

	@Autowired
	UserService userService;

	@GetMapping(value = "/{userEmail}", produces = "application/json")
	public void getUserDetails(@PathVariable String userEmail) {

	}

}
