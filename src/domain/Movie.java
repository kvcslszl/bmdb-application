package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Movie extends Media {

	public Movie(BigDecimal id, String title, String description, LocalDate premier) {
		super(id, title, description, premier);
	}
}
