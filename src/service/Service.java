package service;

import java.util.ArrayList;

import domain.Media;
import domain.Review;
import domain.User;

public class Service {
	
	private ArrayList<Media> medias;
	private ArrayList<Review> reviews;
	private ArrayList<User> users;
	
	public Service() {
		TestData data = new TestData();
		this.medias = data.getMedias();
		this.reviews = data.getReviews();
		this.users = data.getUsers();
	}
	
	public void saveUser(User user) {
		this.users.add(user);
	}
	
	User findUser(String name) {
		for (User user : this.users) {
			if(user.getName() == name) return user;
		}
		return null;
	}
	
	public ArrayList<Media> findAllMedia() {
		return this.medias;
	}
	
	public void saveReview(Review review) {
		review.getSubject().addReview(review);
		this.reviews.add(review);
	}
	
	ArrayList<Review> findAllReview(){
		return this.reviews;
	}
	
	User Login(String name, String password) {
		for(User user : this.users) {
			if(user.getName() == name && user.getPassword() == password)
				return user;
		}
		return null;
	}
}
