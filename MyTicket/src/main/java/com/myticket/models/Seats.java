package com.myticket.models;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Seats {

	private static final int ROW_COUNT = 6;
	private static final int COLUMN_COUNT = 10;
	private Map<String, Boolean> seats;

	@Autowired
	public Seats(Map<String, Boolean> seats) {
		this.seats = seats;
		defineSeats();
	}

	public void defineSeats() {

		char rowIdentifier = 'A';

		for (int i = 1; i <= ROW_COUNT; i++) {

			for (int j = 1; j <= COLUMN_COUNT; j++) {

				String temp = "" + rowIdentifier + j;
				seats.put(temp, true);

			}
			rowIdentifier += 1;
		}

	}

	public boolean bookSeat(String seat) {

		if (seats.get(seat)) {

			seats.put(seat, false);

			return true;
		}

		return false;

	}

	public void cancelSeat(String seat) {

		seats.put(seat, true);

	}

	public List<String> getAvaliableSeats() {

		return seats.keySet().stream().filter(s -> this.seats.get(s) == true).collect(Collectors.toList());

	}
}
