import java.util.Comparator;
public class Movie implements Comparable<Movie> {
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
	 
	    public void setRating(double rating) {
	        this.rating = rating;
	    }
	 
	    public String getMovieName() {
	        return movieName;
	    }
	 
	    public void setMovieName(String movieName) {
	        this.movieName = movieName;
	    }
	 
	    public int getYear() {
	        return year;
	    }
	 
	    public void setYear(int year) {
	        this.year = year;
	    }
	 
	    ///comparing movies based on year only
	    @Override
	    public int compareTo(Movie o) {
	        return this.year - o.year;
	    }
	 
	}
	 
	//class to compare Movie by Rating
	class RatingCompare implements Comparator<Movie>{
	 
	    @Override
	    public int compare(Movie o1, Movie o2) {
	        if(o1.getRating() < o2.getRating()) return -1;
	        if(o1.getRating() > o2.getRating()) return 1;
	        else return 0;
	    }    
	}
	 
	//class to compare Movie ny name
	class NameCompare implements Comparator<Movie>{
	 
	    @Override
	    public int compare(Movie o1, Movie o2) {
	        return o1.getMovieName().compareTo(o2.getMovieName());
	    }

}
