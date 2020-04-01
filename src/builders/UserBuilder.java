package builders;

import java.util.ArrayList;

import domain.Review;
import domain.User;

public class UserBuilder {
	String name;
	String email;
	String password;
	ArrayList<Review> reviews;
	
	public UserBuilder() {
		this.reviews = new ArrayList<Review>();
	}
	
	public UserBuilder addReview(Review review) {
		this.reviews.add(review);
		return this;
	}
	
	public UserBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public UserBuilder setEmail(String email) {
		this.email= email;
		return this;
	}
	
	public UserBuilder setPassword(String pw) {
		this.password = pw;
		return this;
	}

	public User getUser() {
		return new User(name, email, password, reviews);
	}
	

}
