package Model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public final class Series extends Media{

	public Series(BigDecimal id, String title, String description, LocalDate premier, ArrayList<Review> reviews,
			ArrayList<Actor> cast) {
		super(id, title, description, premier, reviews, cast);
		}	
}
