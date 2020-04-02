package builders;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import domain.Actor;
import domain.Media;
import domain.Review;

public class MediaBuilder {
	BigDecimal id;
	String title;
	String description;
	LocalDate premier;
	ArrayList<Review> reviews;
	ArrayList<Actor> cast;
	
	public MediaBuilder() {
		this.reviews = new ArrayList<Review>();
		this.cast = new ArrayList<Actor>();
	}
	
	public MediaBuilder addReview(Review review) {
		this.reviews.add(review);
		return this;
	}
	
	public MediaBuilder addActor(Actor actor) {
		this.cast.add(actor);
		actor.addToFilmography(this.getMedia());
		return this;
	}
	
	public MediaBuilder setId(BigDecimal id) {
		this.id = id;
		return this;
	}
	
	public MediaBuilder setTitle(String title) {
		this.title = title;
		return this;
	}
	
	public MediaBuilder setDescription(String description) {
		this.description = description;
		return this;
	}
	
	public MediaBuilder setPremier(LocalDate premiere) {
		this.premier = premiere;
		return this;
	}
	
	public Media getMedia() {
		Media med =  new Media(id, title, description, premier, cast, reviews);
		return med;
	}

}
