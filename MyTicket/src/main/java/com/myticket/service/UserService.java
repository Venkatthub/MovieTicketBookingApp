package com.myticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myticket.database.UserRepository;
import com.myticket.models.UserProfile;

@Service
public class UserService {

	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {

		this.userRepository = userRepository;

	}

	public void createUser(UserProfile user) {

		userRepository.addUser(user.getUserName(), user.getUserMail(), user.getPassword());

	}

	public boolean checkEmailAlreadyRegistered(String mailId) {

		return userRepository.checkEmailAlreadyExists(mailId);
	}

	public List<UserProfile> getUserDetails(String userEmail) {

		return userRepository.getUserDetails(userEmail);

	}

	public String getTicketDetails(String userEmail) {

		return userRepository.getUserTicketDetails(userEmail);

	}

	public String getUserPassword(String userEmail) {

		return userRepository.retriveUserPassword(userEmail);

	}

}
