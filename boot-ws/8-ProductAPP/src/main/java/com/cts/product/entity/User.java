package com.cts.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String userName;
	private String password;

	private String firstName;
	private String gender;
	private long mobileNumber;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String password, String firstName, String gender, long mobileNumber) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
