package domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Media {
	BigDecimal id;
	String title;
	String description;
	LocalDate premier;
	private ArrayList<Review> reviews;
	private ArrayList<Actor> cast;
	
	public Media(BigDecimal id, String title, String description, LocalDate premier) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.premier = premier;
		this.reviews = new ArrayList<Review>();
		this.cast = new ArrayList<Actor>();
	}
	
	public void addToCast(Actor actor) {
		this.cast.add(actor);
		actor.filmography.add(this);
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getPremier() {
		return this.premier;
	}

	public void setPremier(LocalDate premier) {
		this.premier = premier;
	}

	public ArrayList<Review> getReviews() {
		return this.reviews;
	}

	public void setReviews(ArrayList<Review> reviews) {
		this.reviews = reviews;
	}

	public ArrayList<Actor> getCast() {
		return this.cast;
	}

	public void setCast(ArrayList<Actor> cast) {
		this.cast = cast;
	}
	
	@Override
	public String toString() {
		return ">'" + title + "'\\nDescription=" + description + "'\nPremier=" + premier + "\\nCast=" + cast + 
				", reviews=" + reviews + "]";
	}
}
