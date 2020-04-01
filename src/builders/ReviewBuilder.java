package builders;

import domain.Media;
import domain.Rating;
import domain.Review;
import domain.User;

public class ReviewBuilder {
	String text;
	User writer;
	Media subject;
	Rating type;
	
	public ReviewBuilder( ) {
	}
	
	public ReviewBuilder setText(String text) {
		this.text = text;
		return this;
	}
	
	public ReviewBuilder setWriter(User writer) {
		this.writer = writer;
		writer.addReview(getReview());
		return this;
	}
	
	public ReviewBuilder setSubject(Media subject) {
		this.subject = subject;
		subject.addReview(getReview());
		return this;
	}
	
	public ReviewBuilder setType(Rating score) {
		this.type = score;
		return this;
	}
	
	public Review getReview() {
		return new Review(text, writer, subject, type);
	}
}
