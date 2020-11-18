package com.myticket.database;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

@Repository
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserRepository {

	private Entity user;
	private static final DatastoreService DATASTORE = DatastoreServiceFactory.getDatastoreService();
	private Query query;

	public void addUser(String userName, String userMail, String password) {

		user = new Entity("Users", userMail);

		user.setProperty("User Name", userName);

		user.setProperty("Email ID", userMail);

		user.setProperty("password", password);

		DATASTORE.put(user);

	}

	public String retriveUserName(String userMail) {

		Filter filter = new FilterPredicate("Email ID", FilterOperator.EQUAL, userMail);

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
	
	public void addBookedTickets() {
		
		
	}
	
	public void getUserDetails(String mailId) {
		
	}

}
