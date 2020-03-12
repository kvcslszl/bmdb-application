package Builders;

import java.util.ArrayList;

import Model.Review;
import Model.User;

public class UserBuilder {
	String Name;
	String Email;
	String Password;
	ArrayList<Review> Reviews;
	
	public UserBuilder() {
		this.Reviews = new ArrayList<Review>();
	}
	
	public UserBuilder addReview(Review review) {
		this.Reviews.add(review);
		return this;
	}
	
	public UserBuilder setName(String name) {
		this.Name = name;
		return this;
	}
	
	public UserBuilder setEmail(String email) {
		this.Email= email;
		return this;
	}
	
	public UserBuilder setPassword(String pw) {
		this.Password = pw;
		return this;
	}

	public User getUser() {
		return new User(Name, Email, Password, Reviews);
	}
	

}
