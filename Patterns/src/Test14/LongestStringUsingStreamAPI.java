/*3.	Given a list of strings, write a program using the Stream API to find and print the longest string.*/
package Test14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LongestStringUsingStreamAPI {
    public static void main(String[] args) {
        List<String> ob = new ArrayList<>();
        ob.add("Mumbai");
        ob.add("Pune");
        ob.add("Latur");
        ob.add("Solapur");
        ob.add("Nashik");
        ob.add("Ranchi");
        Optional<String> lon = ob.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println("Longest String is: "+lon);
    }
}
/***********************OUTPUT*************************
 Longest String is: Optional[Solapur]
 *******************************************************/