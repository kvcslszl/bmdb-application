package Builders;

import java.time.LocalDate;
import java.util.ArrayList;

import Model.Actor;
import Model.Media;
import Model.Sex;

public final class ActorBuilder {
	String Name;
	LocalDate Born;
	Sex Sex;
	String Biography;
	ArrayList<Media> Filmography;
	
	public ActorBuilder() { 
		this.Filmography = new ArrayList<Media>();	
	}
	
	public ActorBuilder addFilm(Media media) {
		this.Filmography.add(media);
		return this;
	}

	public ActorBuilder setName(String name) {
		this.Name = name;
		return this;
	}

	public ActorBuilder setBirth(LocalDate birthDate) {
		this.Born = birthDate;
		return this;
	}

	public ActorBuilder setSex(Sex sex) {
		this.Sex = sex;
		return this;
	}

	public ActorBuilder setBiography(String bio) {
		this.Biography = bio;
		return this;
	}
	
	public Actor getActor() {
		return new Actor(Name, Born, Sex, Biography, Filmography);
	}
}
