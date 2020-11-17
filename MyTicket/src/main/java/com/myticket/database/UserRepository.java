package com.myticket.database;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class UserRepository {

	private Entity user;
	private static final DatastoreService DATASTORE = DatastoreServiceFactory.getDatastoreService();

	public void addUser(String userName, String userMail, String password) {

		user = new Entity("Users", userMail);

		user.setProperty("User Name", userName);

		user.setProperty("Email ID", userMail);

		user.setProperty("password", password);

		DATASTORE.put(user);

	}

	public void retriveUser(String userMail) {

	}

}
