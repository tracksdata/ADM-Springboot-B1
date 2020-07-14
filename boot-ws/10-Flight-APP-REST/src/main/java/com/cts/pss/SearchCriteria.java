package com.cts.pss;

import java.time.LocalDate;
import java.time.LocalTime;

public class SearchCriteria {

	public String flightNumber;
	private LocalDate flightDate;
	private LocalTime flightTime;
	private String origin;
	private String destination;
	private int numberOfPassengers;

	public SearchCriteria() {
		// TODO Auto-generated constructor stub
	}

	public SearchCriteria(String flightNumber, LocalDate flightDate, LocalTime flightTime) {
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.flightTime = flightTime;
	}

	public SearchCriteria(LocalDate flightDate, String origin, String destination, int numberOfPassengers) {
		super();
		this.flightDate = flightDate;
		this.origin = origin;
		this.destination = destination;
		this.numberOfPassengers = numberOfPassengers;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public LocalTime getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(LocalTime flightTime) {
		this.flightTime = flightTime;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

}
