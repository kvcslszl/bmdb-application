package service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import builders.ActorBuilder;
import builders.MediaBuilder;
import builders.ReviewBuilder;
import builders.UserBuilder;
import domain.Actor;
import domain.Media;
import domain.Rating;
import domain.Review;
import domain.User;

public class TestData {
	ArrayList<Actor> actors;
	ArrayList<Media> medias;
	ArrayList<Review> reviews;
	ArrayList<User> users;
	
	ActorBuilder actorBuilder;
	MediaBuilder mediaBuilder;
	ReviewBuilder reviewBuilder;
	UserBuilder userBuilder;
	
	public TestData() {
		this.actors = new ArrayList<Actor>();
		this.medias = new ArrayList<Media>();
		this.reviews = new ArrayList<Review>();
		this.users = new ArrayList<User>();
		this.actorBuilder = new ActorBuilder();
		this.mediaBuilder = new MediaBuilder();
		this.reviewBuilder = new ReviewBuilder();
		this.userBuilder = new UserBuilder();
		
		this.generateActors();
		this.generateMedias();
		this.generateUsers();
		this.generateReviews();
	}
	
	public ArrayList<Actor> getActors() {
		return this.actors;
	}
	
	public ArrayList<Media> getMedias() {
		return this.medias;
	}
	
	public ArrayList<Review> getReviews() {
		return this.reviews;
	}
	
	public ArrayList<User> getUsers() {
		return this.users;
	}

	private void generateActors() {
		actors.add(actorBuilder.setName("Jessie Buckley")
				.setBirth(LocalDate.of(1989, 12, 28)).setIsFemale().
				setBiography("Some generic boring information").getActor());
		actors.add(actorBuilder.setName("Jared Harris")
				.setBirth(LocalDate.of(1961, 8, 24)).setIsMale().
				setBiography("Some generic boring information").getActor());
		actors.add(actorBuilder.setName("Daisy Ridle")
				.setBirth(LocalDate.of(1992, 4, 10)).setIsFemale().
				setBiography("Some generic boring information").getActor());
		actors.add(actorBuilder.setName("Adam Driver")
				.setBirth(LocalDate.of(1983, 11, 19)).setIsMale().
				setBiography("Some generic boring information").getActor());
		actors.add(actorBuilder.setName("Mark Hamill")
				.setBirth(LocalDate.of(1951, 9, 25)).setIsMale().
				setBiography("Some generic boring information").getActor());
		actors.add(actorBuilder.setName("Matt Damon")
				.setBirth(LocalDate.of(1970, 10, 8)).setIsMale().
				setBiography("Some generic boring information").getActor());
		actors.add(actorBuilder.setName("Christian Bale")
				.setBirth(LocalDate.of(1974, 1, 30)).setIsMale().
				setBiography("Some generic boring information").getActor());
		actors.add(actorBuilder.setName("Leonardo DiCaprio")
				.setBirth(LocalDate.of(1974, 11, 11)).setIsMale().
				setBiography("Some generic boring information").getActor());
		actors.add(actorBuilder.setName("Joseph Gordon-Levitt")
				.setBirth(LocalDate.of(1981, 1, 30)).setIsMale().
				setBiography("Some generic boring information").getActor());
		actors.add(actorBuilder.setName("Ellen Page")
				.setBirth(LocalDate.of(1987, 2, 20)).setIsMale().
				setBiography("Some generic boring information").getActor());
	}
	
	private void generateMedias() {
		medias.add(mediaBuilder.setId(new BigDecimal(1)).setTitle("Chernobyl").setDescription("In April 1986, "
				+ "an explosion at the Chernobyl nuclear power plant in the Union of Soviet Socialist Republics "
				+ "becomes one of the world's worst man-made catastrophes.")
				.setPremier(LocalDate.of(2019, 5, 7)).getMedia());
		medias.add(mediaBuilder.setId(new BigDecimal(2)).setTitle("Star Wars: Episode IX - The Rise of Skywalker")
				.setDescription("'The surviving members of the resistance face the First Order once again, and the "
				+ "legendary conflict between the Jedi and the Sith reaches its peak bringing the Skywalker "
				+ "saga to its end.").setPremier(LocalDate.of(2019, 12, 19)).getMedia());
		//temp.addToCast(actors.get(2));
		//temp.addToCast(actors.get(3));
		//temp.addToCast(actors.get(4));
		//medias.add(temp);
		/*
		medias.add(mediaBuilder.setId(new BigDecimal(1)).setTitle("Chernobyl").setDescription("In April 1986, "
				+ "an explosion at the Chernobyl nuclear power plant in the Union of Soviet Socialist Republics "
				+ "becomes one of the world's worst man-made catastrophes.")
				.setPremier(LocalDate.of(2019, 5, 7)).addActor(actors.get(0)).addActor(actors.get(1)).getMedia());
		medias.add(mediaBuilder.setId(new BigDecimal(2)).setTitle("Star Wars: Episode IX - The Rise of Skywalker")
				.setDescription("'The surviving members of the resistance face the First Order once again, and the "
				+ "legendary conflict between the Jedi and the Sith reaches its peak bringing the Skywalker "
				+ "saga to its end.").setPremier(LocalDate.of(2019, 12, 19)).addActor(actors.get(2))
				.addActor(actors.get(3)).addActor(actors.get(4)).getMedia());*/
		medias.add(mediaBuilder.setId(new BigDecimal(3)).setTitle("Ford v Ferrari").setDescription("American car "
				+ "designer Carroll Shelby and driver Ken Miles battle corporate interference, the laws of physics "
				+ "and their own personal demons to build a revolutionary race car for Ford and challenge Ferrari "
				+ "at the 24 Hours of Le Mans in 1966.").setPremier(LocalDate.of(2019, 11, 15)).getMedia());
		medias.add(mediaBuilder.setId(new BigDecimal(4)).setTitle("Inception").setDescription("A thief who steals "
				+ "corporate secrets through the use of dream-sharing technology is given the inverse task of planting "
				+ "an idea into the mind of a C.E.O.").setPremier(LocalDate.of(2010, 7, 16)).getMedia());
		
		medias.get(0).addToCast(actors.get(0));
		medias.get(0).addToCast(actors.get(1));
		medias.get(1).addToCast(actors.get(2));
		medias.get(1).addToCast(actors.get(3));
		medias.get(1).addToCast(actors.get(4));
		medias.get(2).addToCast(actors.get(5));
		medias.get(2).addToCast(actors.get(6));
		medias.get(3).addToCast(actors.get(7));
		medias.get(3).addToCast(actors.get(8));
		medias.get(3).addToCast(actors.get(9));
	}

	private void generateUsers() {
		users.add(userBuilder.setName("Teszt Elek").setEmail("tesztelek007@freemail.com")
				.setPassword("jelszo123").getUser());
		users.add(userBuilder.setName("Próba Pál").setEmail("legjobbimelcim@gmail.com")
				.setPassword("sosemtalalodki").getUser());
		users.add(userBuilder.setName("Történész István").setEmail("biblialover33@citromail.com")
				.setPassword("qwerty").getUser());
	}

	private void generateReviews() {
		reviews.add(reviewBuilder.setWriter(users.get(2)).setSubject(medias.get(0)).setType(Rating.GOOD)
				.setText("I'm Russian. Amazing work! Newer, you hear this, never ever before western cinematography"
						+ " made such authentic film. I speak about details: cars, kitchens, clothes...").getReview());
		reviews.add(reviewBuilder.setWriter(users.get(1)).setSubject(medias.get(1)).setType(Rating.BAD)
				.setText("As a long time SW fan, this is just sad.").getReview());
		reviews.add(reviewBuilder.setWriter(users.get(2)).setSubject(medias.get(2)).setType(Rating.AVERAGE)
				.setText("CARS GO FAST VROOM VROOM!!!").getReview());
		reviews.add(reviewBuilder.setWriter(users.get(0)).setSubject(medias.get(1)).setType(Rating.AVERAGE)
				.setText("I was meant to watch the new Fast & Furious movie so this waas definiately a stepup").getReview());
		reviews.add(reviewBuilder.setWriter(users.get(1)).setSubject(medias.get(3)).setType(Rating.GOOD)
				.setText("Why are you reading a review just go watch the damn movie (again)!!!").getReview());
		reviews.add(reviewBuilder.setWriter(users.get(1)).setSubject(medias.get(0)).setType(Rating.AVERAGE)
				.setText("I dont speak a single word of english but just the visuals were enough to give me a semi :)").getReview());
		reviews.add(reviewBuilder.setWriter(users.get(0)).setSubject(medias.get(2)).setType(Rating.GOOD)
				.setText("JUST GIVE DICAPRIO HIS OSCAR ALREADY!!!").getReview());
	}
}
