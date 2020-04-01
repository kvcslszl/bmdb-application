package domain;

import java.util.ArrayList;

public final class User {
	String name;
	String email;
	String password;
	ArrayList<Review> reviews;
	
	public User(String name, String email, String password, ArrayList<Review> reviews) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.reviews = reviews;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Review> getReviews() {
		return this.reviews;
	}

	public void setReviews(ArrayList<Review> reviews) {
		this.reviews = reviews;
	}
	
	public void addReview(Review review) {
		this.reviews.add(review);
		review.writer = this;
	}
}
