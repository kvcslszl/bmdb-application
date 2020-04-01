package domain;

import java.time.LocalDate;
import java.util.ArrayList;

public final class Actor {
	String name;
	LocalDate born;
	Sex sex;
	String biography;
	ArrayList<Media> filmography;
	
	public Actor(String name, LocalDate born, domain.Sex sex, String biography, ArrayList<Media> filmography) {
		this.name = name;
		this.born = born;
		this.sex = sex;
		this.biography = biography;
		this.filmography = filmography;
	}
	
	public void addToFilmography(Media media) {
		this.filmography.add(media);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBorn() {
		return this.born;
	}

	public void setBorn(LocalDate born) {
		this.born = born;
	}

	public Sex getSex() {
		return this.sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public String getBiography() {
		return this.biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public ArrayList<Media> getFilmography() {
		return this.filmography;
	}

	public void setFilmography(ArrayList<Media> filmography) {
		this.filmography = filmography;
	}

	@Override
	public String toString() {
		return "name= " + name + ", born=" + born;
	}
}
