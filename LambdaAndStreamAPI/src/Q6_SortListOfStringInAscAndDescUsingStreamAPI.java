/*6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q6_SortListOfStringInAscAndDescUsingStreamAPI {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Codenera");
        al.add("Pune");
        al.add("Mumbai");
        al.add("Java");
        al.add("Python");
        al.add("React");
        System.out.println("ArrayList: "+al);
        List<String> ascSort = al.stream().sorted().toList();
        List<String> descSort = al.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Ascending Sort: "+ascSort);
        System.out.println("Ascending Sort: "+descSort);

    }
}
/**********************************OUTPUT*******************************
 ArrayList: [Codenera, Pune, Mumbai, Java, Python, React]
 Ascending Sort: [Codenera, Java, Mumbai, Pune, Python, React]
 Ascending Sort: [React, Python, Pune, Mumbai, Java, Codenera]
 ***********************************************************************/