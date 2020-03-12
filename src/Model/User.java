package Model;

import java.util.ArrayList;

public final class User {
	String Name;
	String Email;
	String Password;
	ArrayList<Review> Reviews;
	
	public User(String name, String email, String password, ArrayList<Review> reviews) {
		super();
		Name = name;
		Email = email;
		Password = password;
		Reviews = reviews;
	}
	
	public void addReview(Review review) {
		this.Reviews.add(review);
		review.Writer = this;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public ArrayList<Review> getReviews() {
		return Reviews;
	}

	public void setReviews(ArrayList<Review> reviews) {
		Reviews = reviews;
	}
}
