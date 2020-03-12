package App;

import java.util.Scanner;

import App.App;
import Builders.UserBuilder;
import Model.User;
import Model.Media;
import Model.Review;

public class View {
	
	public View() {
	}
	
	public User readUserData() {
		Scanner scanner = new Scanner(System. in);
		
		System.out.println("> What is your name?");
		String userName = scanner. nextLine();
		System.out.println("> What is your email address?");
		String email = scanner. nextLine();
		System.out.println("> What is your password?");
		String password = scanner. nextLine();
		
		UserBuilder userBuilder = new UserBuilder();
		User user = userBuilder.setName(userName)
				.setEmail(email)
				.setPassword(password)
				.getUser();
		
		scanner.close();
		return user;
	}
	
	public void printWelcomeMessage() {
		System.out.println("> Welcome to the movie and series review application!");
	}
	
	public void printMedias() {
		for (Media med : App.medias) 
		{ 
			System.out.println(med.toString());
		}
	}
	
	public void printReviews() {
		for (Review rev : App.selectedMedia.getReviews()) 
		{ 
			System.out.println(rev.toString());
		}
	}

}
