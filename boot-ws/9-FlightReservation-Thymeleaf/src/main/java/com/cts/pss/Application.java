package com.cts.pss;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.pss.dao.FlightDao;
import com.cts.pss.entity.Fare;
import com.cts.pss.entity.Flight;
import com.cts.pss.entity.Inventory;
import com.cts.pss.service.SearchFlightServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(Application.class, args);
		FlightDao flightDao = ac.getBean(FlightDao.class);
		SearchFlightServiceImpl fs = ac.getBean(SearchFlightServiceImpl.class);

		Flight f1 = new Flight("AI-150", "HYDERABAD", "DELHI", LocalDate.of(2020, 8, 21), LocalTime.of(17, 45),
				new Inventory(150), new Fare(7500));
		Flight f2 = new Flight("6E-120", "HYDERABAD", "DELHI", LocalDate.of(2020, 9, 21), LocalTime.of(17, 45),
				new Inventory(150), new Fare(7500));
		Flight f3 = new Flight("6E-250", "HYDERABAD", "PUNE", LocalDate.of(2020, 8, 21), LocalTime.of(17, 45),
				new Inventory(150), new Fare(7500));
		Flight f4 = new Flight("AI-500", "HYDERABAD", "KOLKATA", LocalDate.of(2020, 8, 21), LocalTime.of(17, 45),
				new Inventory(150), new Fare(7500));
		Flight f5 = new Flight("AI-450", "PUNE", "MUMBAI", LocalDate.of(2020, 8, 21), LocalTime.of(17, 45),
				new Inventory(150), new Fare(7500));

		// flightDao.saveAll(Arrays.asList(f1,f2,f3,f4,f5));

		SearchCriteria c1 = new SearchCriteria(LocalDate.of(2020, 8, 21), "HYDERABAD", "DELHI", 5);

		Stream<Flight> flights = fs.search(c1);

		flights.forEach(flight -> { 
			System.out.println(flight.getId());
			System.out.println(flight.getFlightNumber());
			System.out.println(flight.getFare().getAmount());
		});

	}

}
