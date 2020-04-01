package app;
import java.util.ArrayList;

import builders.ActorBuilder;
import builders.MediaBuilder;
import builders.ReviewBuilder;
import builders.UserBuilder;
import domain.Media;
import domain.Review;
import service.Service;
import view.View;;

public class App {
	
	private Service service;
	private View view;
	public Review review;
	// public IO io;
	static public ArrayList<Media> medias;
	static public Media selectedMedia;
	
	
	public static void main(String[] args) {
		App app = new App(new Service(), new View());
		app.play();
	}

	public App(Service service, View view) {
		super();
		this.service = service;
		this.view = view;
	}
	
	public void play() {
		view.readUserData();
		view.printWelcomeMessage();
		
		// to be continued:
		// view.printMedias();
	}
	
	public void createUser() {
		
	}
	
	public void doReview() {
		
	}
	
	public void printReviewAverage() {
		
	}
}
