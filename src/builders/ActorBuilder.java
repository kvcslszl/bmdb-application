package builders;

import java.time.LocalDate;
import java.util.ArrayList;

import domain.Actor;
import domain.Media;
import domain.Sex;

public final class ActorBuilder {
	String name;
	LocalDate born;
	Sex sex;
	String biography;
	ArrayList<Media> filmography;
	
	public ActorBuilder() { 
		this.filmography = new ArrayList<Media>();	
	}
	
	public ActorBuilder addFilm(Media media) {
		this.filmography.add(media);
		return this;
	}

	public ActorBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public ActorBuilder setBirth(LocalDate birthDate) {
		this.born = birthDate;
		return this;
	}

	public ActorBuilder setSex(Sex sex) {
		this.sex = sex;
		return this;
	}

	public ActorBuilder setBiography(String bio) {
		this.biography = bio;
		return this;
	}
	
	public Actor getActor() {
		return new Actor(name, born, sex, biography, filmography);
	}
}
