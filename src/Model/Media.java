package Model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Media {
	BigDecimal Id;
	String Title;
	String Description;
	LocalDate Premier;
	private ArrayList<Review> Reviews;
	private ArrayList<Actor> Cast;
	
	public Media(BigDecimal id, String title, String description, LocalDate premier) {
		this.Id = id;
		this.Title = title;
		this.Description = description;
		this.Premier = premier;
		this.Reviews = new ArrayList<Review>();
		this.Cast = new ArrayList<Actor>();
	}
	
	public void addToCast(Actor actor) {
		this.Cast.add(actor);
		actor.Filmography.add(this);
	}
	
	public void addReview(Review review) {
		this.Reviews.add(review);
	}

	public BigDecimal getId() {
		return Id;
	}

	public void setId(BigDecimal id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public LocalDate getPremier() {
		return Premier;
	}

	public void setPremier(LocalDate premier) {
		Premier = premier;
	}

	public ArrayList<Review> getReviews() {
		return Reviews;
	}

	public void setReviews(ArrayList<Review> reviews) {
		Reviews = reviews;
	}

	public ArrayList<Actor> getCast() {
		return Cast;
	}

	public void setCast(ArrayList<Actor> cast) {
		Cast = cast;
	}
	
	@Override
	public String toString() {
		return ">'" + Title + "'\\nDescription=" + Description + "'\nPremier=" + Premier + "\\nCast=" + Cast + 
				", Reviews=" + Reviews + "]";
	}
}
