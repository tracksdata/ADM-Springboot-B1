package com.cts.product.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double price;
	private String description;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, double price, String description) {

		this.name = name;
		this.price = price;
		this.description = description;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "productReviews", joinColumns = { @JoinColumn(name = "id") }, inverseJoinColumns = {
			@JoinColumn(name = "reviewId") })
	private List<Reviews> reviews = new ArrayList<>();

	public int getId() {
		return id;
	}

	public List<Reviews> getReviews() {
		return reviews;
	}

	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
