package com.cts.pss.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.SearchCriteria;
import com.cts.pss.dao.FlightDao;
import com.cts.pss.entity.Flight;

@Service
public class SearchFlightServiceImpl {

	@Autowired
	private FlightDao flightDao;

	public Stream<Flight> search(SearchCriteria searchCriteria) {

		List<Flight> flights = flightDao.findByFlightDateAndOriginAndDestination(searchCriteria.getFlightDate(),
				searchCriteria.getOrigin(), searchCriteria.getDestination());

		Stream<Flight> searchReasults = flights.stream()
				.filter(flight -> flight.getInventory().getCount() >= searchCriteria.getNumberOfPassengers());

		return searchReasults;
	}
}
