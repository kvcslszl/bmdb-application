package Builders;

import Model.Media;
import Model.Rating;
import Model.Review;
import Model.User;

public class ReviewBuilder {
	String Text;
	User Writer;
	Media Subject;
	Rating Type;
	
	public ReviewBuilder( ) {
	}
	
	public ReviewBuilder setName(String text) {
		this.Text = text;
		return this;
	}
	
	public ReviewBuilder setWriter(User writer) {
		this.Writer = writer;
		writer.addReview(getReview());
		return this;
	}
	
	public ReviewBuilder setSubject(Media subject) {
		this.Subject = subject;
		subject.addReview(getReview());
		return this;
	}
	
	public ReviewBuilder setType(Rating score) {
		this.Type = score;
		return this;
	}
	
	public Review getReview() {
		return new Review(Text, Writer, Subject, Type);
	}
}
