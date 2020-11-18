package com.myticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.myticket.database.UserRepository;
import com.myticket.models.UserProfile;

@Service
public class UserService {

	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {

		System.out.println("Constructor injection");
		this.userRepository = userRepository;

	}

	public void createUser(UserProfile user) {

		userRepository.addUser(user.getUserName(), user.getUserMail(), user.getPassword());

	}

	public boolean checkEmailAlreadyRegistered(String mailId) {

		System.out.println(userRepository);

		return userRepository.checkEmailAlreadyExists(mailId);
	}

	public void fetchUser(String userMailId) {

	}

}
