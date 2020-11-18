package com.myticket.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.myticket.models.movies.ScreenA;
import com.myticket.models.movies.ScreenB;
import com.myticket.models.movies.ScreenC;
import com.myticket.models.movies.ScreenD;

@Controller
public class SetMovieToScreensController {

	@RequestMapping(value = "/movies/screen-a", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void assignMovieToScreenA(@RequestBody String movieName, Model model) {

		ScreenA.movieName = movieName;
		System.out.println(movieName);

	}

	@RequestMapping(value = "/movies/screen-b", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void assignMovieToScreenB(@RequestBody String movieName, Model model) {

		ScreenB.movieName = movieName;
		System.out.println(movieName);

	}

	@RequestMapping(value = "/movies/screen-c", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void assignMovieToScreenC(@RequestBody String movieName, Model model) {

		ScreenC.movieName = movieName;
		System.out.println(movieName);
	}

	@RequestMapping(value = "/movies/screen-d", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void assignMovieToScreenD(@RequestBody String movieName, Model model) {

		ScreenD.movieName = movieName;
		System.out.println(movieName);

	}

}
