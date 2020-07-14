package com.cts.pss.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fare {
	@Id
	@GeneratedValue
	private int fareId;
	private double amount;

	public Fare() {
		// TODO Auto-generated constructor stub
	}

	public Fare(double amount) {
		this.amount = amount;
	}

	public int getFareId() {
		return fareId;
	}

	public void setFareId(int fareId) {
		this.fareId = fareId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
