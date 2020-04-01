package Model;

public class Review {
	String Text;
	User Writer;
	Media Subject;
	Rating Type;
	
	public Review(String text, User writer, Media subject, Rating type) {
		Text = text;
		Writer = writer;
		Subject = subject;
		Type = type;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public User getWriter() {
		return Writer;
	}

	public void setWriter(User writer) {
		Writer = writer;
	}

	public Media getSubject() {
		return Subject;
	}

	public void setSubject(Media subject) {
		Subject = subject;
	}

	public Rating getType() {
		return Type;
	}

	public void setType(Rating type) {
		Type = type;
	}

	@Override
	public String toString() {
		return "'" + Text + "'\n rating=" + Type + "\n";
	}
	
}
