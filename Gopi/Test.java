import java.util.ArrayList;
import java.util.Collections;
 
public class Test {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Bahubali", 9.1, 2024));
        list.add(new Movie("RRR", 9.7, 2021));
        list.add(new Movie("Panchayat", 9.4, 2016));
        list.add(new Movie("Gullak", 9.8, 2022));

        Collections.sort(list);

        System.out.println("Movies Sorted by year using Comparable: ");

        for(Movie movie: list) {
            System.err.println(movie.getMovieName() + "  " + movie.getRating() + "  " + movie.getYear());

        }

        System.out.println("\n \n Movies Sorted by rating using Comparator");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie: list) {
            System.out.println(movie.getRating()+ " " + movie.getMovieName() + " " + movie.getYear());
        }

        System.out.println("\n \n Movies Sorted by name using Comparator");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie: list) {
            System.out.println(movie.getMovieName()+ " " + movie.getRating() + " " + movie.getYear());
        }
    }
}