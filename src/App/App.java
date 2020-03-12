package App;
import java.util.ArrayList;

import Builders.MediaBuilder;
import Builders.ReviewBuilder;
import Builders.UserBuilder;
import Builders.ActorBuilder;
import Model.Media;
import Model.Review;;

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
	
	public void testDataGenerator() {
		MediaBuilder mediaBuilder = new MediaBuilder();
		ActorBuilder actorBuilder = new ActorBuilder();
		ReviewBuilder reviewBuilder = new ReviewBuilder();
		UserBuilder userBuilder = new UserBuilder();
		// ...
	}
}
