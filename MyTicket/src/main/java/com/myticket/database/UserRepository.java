package com.myticket.database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.myticket.models.UserProfile;

@Repository
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserRepository {

	private Entity user;
	private Entity ticket;
	private static final DatastoreService DATASTORE = DatastoreServiceFactory.getDatastoreService();
	private Query query;

	@Autowired
	private UserProfile profile;

	public void addUser(String userName, String email, String password) {

		user = new Entity("Users", email);

		user.setProperty("User Name", userName);

		user.setProperty("Email ID", email);

		user.setProperty("Password", password);

		DATASTORE.put(user);

	}

	public String retriveUserName(String email) {

		Filter filter = new FilterPredicate("Email ID", FilterOperator.EQUAL, email);

		this.query = new Query("Users").setFilter(filter);

		PreparedQuery pq = DATASTORE.prepare(query);

		Entity e = pq.asSingleEntity();

		return e.getProperty("User Name").toString();

	}

	public boolean checkEmailAlreadyExists(String email) {

		Filter filter = new FilterPredicate("Email ID", FilterOperator.EQUAL, email);

		this.query = new Query("Users").setFilter(filter);

		PreparedQuery prepare = DATASTORE.prepare(query);

		if (prepare.asSingleEntity() != null) {

			return true;
		}

		return false;

	}

	public boolean validateCredentials(String email, String password) {

		Filter emailFilter = new FilterPredicate("Email ID", FilterOperator.EQUAL, email);

		this.query = new Query("Users").setFilter(emailFilter);

		PreparedQuery prepare = DATASTORE.prepare(query);

		if (prepare.asSingleEntity() != null) {

			Entity e = prepare.asSingleEntity();

			if (email.contentEquals(e.getProperty("Email ID").toString())
					&& password.contentEquals(e.getProperty("password").toString()))

				return true;
		}

		return false;

	}

	public Key retriveUserKey(String email) {

		Filter emailFilter = new FilterPredicate("Email ID", FilterOperator.EQUAL, email);

		this.query = new Query("Users").setFilter(emailFilter);

		PreparedQuery prepare = DATASTORE.prepare(query);

		Entity e = prepare.asSingleEntity();

		return e.getKey();

	}

	public void putTicket(String email, String seats, long totalCost, String movieName, String screenName) {

		ticket = new Entity("Ticket", retriveUserKey(email));

		ticket.setProperty("Seats", seats);

		ticket.setProperty("Cost", totalCost);

		ticket.setProperty("movie", movieName);

		ticket.setProperty("screen", screenName);

		DATASTORE.put(ticket);

	}

	public void cancelTicket(String movieName) {

		Filter cancelTicketFilter = new FilterPredicate("movie", FilterOperator.EQUAL, movieName);

		this.query = new Query("Ticket").setFilter(cancelTicketFilter);

		PreparedQuery prepare = DATASTORE.prepare(query);

		Entity e = prepare.asSingleEntity();

		DATASTORE.delete(e.getKey());
	}

	public List<UserProfile> getUserDetails(String email) {

		this.query = new Query("Users");

		PreparedQuery prepare = DATASTORE.prepare(query);

		List<UserProfile> allUsers = new ArrayList<>();

		for (Entity e : prepare.asIterable()) {

			UserProfile user = new UserProfile();

			user.setUserName(e.getProperty("User Name").toString());

			user.setUserMail(e.getProperty("Email ID").toString());

			user.setPassword(e.getProperty("password").toString());

			allUsers.add(user);

		}

		return allUsers;

	}

}
