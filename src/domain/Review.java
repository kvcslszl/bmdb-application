package domain;

public class Review {
	String text;
	User writer;
	Media media;
	public Rating type;
	
	public Review(String text, User writer, Media subject, Rating type) {
		this.text = text;
		this.writer = writer;
		this.media = subject;
		this.type = type;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getWriter() {
		return this.writer;
	}

	public void setWriter(User writer) {
		this.writer = writer;
	}

	public Media getSubject() {
		return this.media;
	}

	public void setSubject(Media subject) {
		this.media = subject;
	}

	public Rating getType() {
		return this.type;
	}

	public void setType(Rating type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("\t%s: '%s' \nrating=%s\n", writer.name, text, type);
	}
	
}
