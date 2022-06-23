package technicaltraining;
import java.util.Comparator;

public class Movie implements Comparable <Movie> 
{
	private double rating;
	private String movieName;
	private int year;



	public Movie(String movieName, double rating, int year) {
	super();
	this.rating = rating;
	this.movieName = movieName;
	this.year = year;
	}

	public double getRating() {
	return rating;
}
}
