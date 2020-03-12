package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public final class Actor {
	String Name;
	LocalDate Born;
	Sex Sex;
	String Biography;
	ArrayList<Media> Filmography;
	
	public Actor(String name, LocalDate born, Model.Sex sex, String biography, ArrayList<Media> filmography) {
		super();
		Name = name;
		Born = born;
		Sex = sex;
		Biography = biography;
		Filmography = filmography;
	}
	
	public void addToFilmography(Media media) {
		this.Filmography.add(media);
	}
	
	

	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public LocalDate getBorn() {
		return Born;
	}



	public void setBorn(LocalDate born) {
		Born = born;
	}



	public Sex getSex() {
		return Sex;
	}



	public void setSex(Sex sex) {
		Sex = sex;
	}



	public String getBiography() {
		return Biography;
	}



	public void setBiography(String biography) {
		Biography = biography;
	}



	public ArrayList<Media> getFilmography() {
		return Filmography;
	}



	public void setFilmography(ArrayList<Media> filmography) {
		Filmography = filmography;
	}



	@Override
	public String toString() {
		return "name= " + Name + ", born=" + Born;
	}
}
