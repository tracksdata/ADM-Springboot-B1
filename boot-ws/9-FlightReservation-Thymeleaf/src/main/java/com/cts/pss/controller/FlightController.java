package com.cts.pss.controller;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.pss.SearchCriteria;
import com.cts.pss.entity.Flight;
import com.cts.pss.service.SearchFlightServiceImpl;

@Controller
public class FlightController {

	@Autowired
	private SearchFlightServiceImpl sf;

	@RequestMapping("/book")
	public String bookTicket(@RequestParam("flightNumber") String flightNumber) {

		System.out.println("====> " + flightNumber);
		return null;
	}

	@RequestMapping("/listAll")
	public String listAll(Model data) {
		Stream<Flight> flights = sf.search(new SearchCriteria(LocalDate.of(2020, 8, 21), "HYDERABAD", "DELHI", 8));
		// data.addAttribute("flights", flights);
		data.addAttribute("flights", (Iterable<Flight>) flights::iterator);

		return "flights";
	}
}
