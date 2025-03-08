package JAN3.Que6;

import java.util.ArrayList;
import java.util.Collections;

public class CompareBasedOnHeightUsingComparable {
    public static void main(String[] args) {
        ArrayList<Person> ob = new ArrayList<>();
        ob.add(new Person("Lakhan",8));
        ob.add(new Person("Ram",4));
        ob.add(new Person("Mayur",5));
        ob.add(new Person("Narayan",3));
        Collections.sort(ob);
        System.out.println(ob);
    }
}
