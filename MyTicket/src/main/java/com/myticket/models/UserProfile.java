package com.myticket.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserProfile {

	private String userName;
	private String userMail;
	private String password;

	private List<String[]> bookedTickets = new ArrayList<>();

	public List<String[]> getBookedTickets() {
		return bookedTickets;
	}

	public void setBookedTickets(List<String[]> bookedTickets) {
		this.bookedTickets = bookedTickets;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
