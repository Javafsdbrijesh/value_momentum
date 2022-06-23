package trainings;

import java.util.Comparator;
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
	


