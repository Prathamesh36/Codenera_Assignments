package JAN3.Que12;

import java.util.Comparator;

public class sortingBasedOnYear implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getRelease_date()-o2.getRelease_date();
    }
}
