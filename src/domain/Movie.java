package domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public final class Movie extends Media {

	public Movie(BigDecimal id, String title, String description, LocalDate premier, ArrayList<Actor> cast, ArrayList<Review> reviews) {
		super(id, title, description, premier, cast, reviews);
	}
}
