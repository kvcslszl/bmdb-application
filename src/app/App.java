package app;
import java.io.Console;
import java.util.ArrayList;

import domain.Media;
import domain.Review;
import domain.User;
import service.Service;
import view.View;;

public class App {
	
	Service service;
	View view;
	User user;
	Review review;
	ArrayList<Media> medias;
	Media selectedMedia;
	Console console;
	
	public static void main(String[] args) {
		App app = new App(new Service(), new View());
		app.play();
	}

	public App(Service service, View view) {
		this.service = service;
		this.view = view;
		this.medias = service.findAllMedia();
	}
	
	public void play() {
		boolean exit = false;
		
		this.user = view.readUserData();
		this.service.saveUser(this.user);
		this.view.printWelcomeMessage();
		
		while(!exit) {
			this.view.printMedias(this.medias);
			
			do {
				this.selectedMedia = this.returnMediaById(this.view.readId());
				if(this.selectedMedia == null) this.view.printIncorrectInput();
			} while(this.selectedMedia == null);

			this.doReview();
			this.service.saveReview(this.review);
			this.printReviewAverage();
			
			exit = !this.view.doesUserWantAnotherReview();
		}
	}
	
	public void createUser() {
		this.service.saveUser(view.readUserData());
	}
	
	Media returnMediaById(int id) {
		for(Media media : this.medias) {
			if(media.getId().intValue() == id) return media;
		}
		return null;
	}
	
	public void doReview() {
		this.review = new Review(view.readNewReview(), this.user, this.selectedMedia, view.readRating());
	}
	
	public void printReviewAverage() {
		/*int sum = 0;
		int number = 0;
		for(Review review : selectedMedia.getReviews()) {
			sum += review.type.valueOfRating(review.type);
			number++;
		}*/
		
		this.view.printAverage(1/1);
	}
}
