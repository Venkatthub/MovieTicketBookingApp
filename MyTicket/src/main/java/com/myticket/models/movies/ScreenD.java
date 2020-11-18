package com.myticket.models.movies;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myticket.models.Seats;

@Component("screen4")
public class ScreenD implements ShowMovie {

	private Seats seats;

	public static String movieName;

	@Autowired
	public ScreenD(Seats seats) {

		this.seats = seats;
	}

	public String getMovieName() {
		return movieName;
	}

	public List<String> ticketsAvailable() {

		return seats.getAvaliableSeats();
	}

	public void cancelTicket(String seatsToCancel) {

		seats.cancelSeat(seatsToCancel);
	}

	@Override
	public String show() {

		return "Movie :" + movieName + " Avalilabe seats :" + seats.getAvaliableSeats();

	}

	public void bookTicket(Set<String> seatNumbers) {

		for (String seat : seatNumbers) {

			seats.bookSeat(seat);

		}

	}

}
