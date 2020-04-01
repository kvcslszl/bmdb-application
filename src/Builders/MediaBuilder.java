package Builders;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import Model.Actor;
import Model.Media;
import Model.Review;

public class MediaBuilder {
	BigDecimal Id;
	String Title;
	String Description;
	LocalDate Premier;
	ArrayList<Review> Reviews;
	ArrayList<Actor> Cast;
	
	public MediaBuilder() {
		this.Reviews = new ArrayList<Review>();
		this.Cast = new ArrayList<Actor>();
	}
	
	public MediaBuilder addReview(Review review) {
		this.Reviews.add(review);
		return this;
	}
	
	public MediaBuilder addActor(Actor actor) {
		this.Cast.add(actor);
		actor.addToFilmography(this.getMedia());
		return this;
	}
	
	public MediaBuilder setId(BigDecimal id) {
		this.Id = id;
		return this;
	}
	
	public MediaBuilder setTitle(String title) {
		this.Title = title;
		return this;
	}
	
	public MediaBuilder setDescription(String description) {
		this.Description = description;
		return this;
	}
	
	public MediaBuilder setPremier(LocalDate premiere) {
		this.Premier = premiere;
		return this;
	}
	
	public Media getMedia() {
		return new Media(Id, Title, Description, Premier);
	}

}
