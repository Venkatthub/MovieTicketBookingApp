package com.myticket.models;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class UserProfile {

	private String userName;
	private String userMail;
	private String password;

	private Set<Ticket> bookedTickets;

	public Set<Ticket> getTicketsBooked() {
		return bookedTickets;
	}

	public void setTicketsBooked(Set<Ticket> bookedTickets) {
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
