package com.cts.product.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reviews {
	@Id
	@GeneratedValue
	private int reviewId;
	private String review;
	private LocalDateTime reviewDate;

	public Reviews() {
		// TODO Auto-generated constructor stub
	}

	public Reviews(String review, LocalDateTime reviewDate, User user) {
		super();
		this.review = review;
		this.reviewDate = reviewDate;
		this.user = user;
	}

	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "userName")
	private User user;

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public LocalDateTime getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(LocalDateTime reviewDate) {
		this.reviewDate = reviewDate;
	}

}
