package domain;

public class Review {
	String text;
	User writer;
	Media subject;
	Rating type;
	
	public Review(String text, User writer, Media subject, Rating type) {
		this.text = text;
		this.writer = writer;
		this.subject = subject;
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
		return this.subject;
	}

	public void setSubject(Media subject) {
		this.subject = subject;
	}

	public Rating getType() {
		return this.type;
	}

	public void setType(Rating type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "'" + text + "'\n rating=" + type + "\n";
	}
	
}
