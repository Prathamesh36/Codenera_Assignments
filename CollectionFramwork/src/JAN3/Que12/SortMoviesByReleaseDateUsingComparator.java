package JAN3.Que12;

import java.util.ArrayList;
import java.util.Collections;

public class SortMoviesByReleaseDateUsingComparator {
    public static void main(String[] args) {
        ArrayList<Movie> ob = new ArrayList<>();
        ob.add(new Movie("PK",2015));
        ob.add(new Movie("Tarzan",2010));
        ob.add(new Movie("DDLJ",1999));
        ob.add(new Movie("Players",2014));
        Collections.sort(ob,new sortingBasedOnYear());
        System.out.println(ob);


    }
}
