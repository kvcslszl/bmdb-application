package view;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import builders.UserBuilder;
import domain.Media;
import domain.Rating;
import domain.Review;
import domain.User;

public class View {
	Scanner scanner;
	UserBuilder userBuilder;
	
	public View() {
		scanner = new Scanner(System. in);
		userBuilder = new UserBuilder();
	}
	
	public User readUserData() {
		System.out.println("> What is your name?");
		userBuilder.setName(scanner.nextLine());
		System.out.println("> What is your email address?");
		userBuilder.setEmail(scanner.nextLine());
		System.out.println("> What is your password?");
		userBuilder.setPassword(scanner.nextLine());
		
		//scanner.close();
		return userBuilder.getUser();
	}
	
	public void printWelcomeMessage() {
		System.out.println("> Welcome to the movie and series review application!");
	}
	
	public void printMedias(ArrayList<Media> medias) {
		for (Media media : medias) 
		{ 
			System.out.println(media);
		}
	}
	
	public void printReviews(User user) {
		for (Review review : user.getReviews()) 
		{ 
			System.out.println(review.toString());
		}
	}
	
	public void printAverage(float average) {
		DecimalFormat decimal = new DecimalFormat("0.00");
		System.out.println("Average of reviews: " + decimal.format(average));
	}
	
	public String readNewReview() {
		System.out.println("Write a review");
		return scanner.nextLine();
	}
	
	public boolean doesUserWantAnotherReview() {
		boolean exit = false;
		
		while(!exit) {
			exit = true;
			System.out.println("Do you want to write another review? (yes, no)");
			String input = scanner.nextLine();
			input = input.toLowerCase();
			
			if(input.equals("yes")) {
				 return Boolean.TRUE;
			}
			if(input.equals("no")) {
				 return Boolean.FALSE;
			}
			
			this.printIncorrectInput();
			exit=false;
		}
		return Boolean.FALSE;
	}
	
	public Rating readRating() {
		boolean exit = false;
		String input;
		
		while(!exit) {
			System.out.println("Choose a rating! (BAD, AVERAGE, GOOD)");
			input = scanner.nextLine();
			
			switch(input.toLowerCase()) {
			case "bad":
				return Rating.BAD;
			case "average":
				return Rating.AVERAGE;
			case "good":
				return Rating.GOOD;
			default:
				this.printIncorrectInput();
				exit = false;
			}
		}
		input = scanner.nextLine();
		
		return null;
	}
	
	public int readId() {
		System.out.println("> Choose an id");
		return Integer.parseInt(scanner.nextLine());
	}
	
	public void printIncorrectInput() {
		System.out.println("Incorrect input!");
	}

}
