/*4. Write a Java program to remove all duplicate elements from a list using streams.*/
import java.util.ArrayList;
import java.util.List;

public class Q4_RemoveAllDuplicateFromListUsingStreamAPI {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Java");
        al.add("Python");
        al.add("React");
        al.add("Java");
        al.add("Python");
        al.add("React");
        System.out.println("ArrayList: "+al);
        List<String> ans = al.stream().distinct().toList();
        System.out.println("OUTPUT: "+ans);
    }
}
/**********************************OUTPUT*******************************
 ArrayList: [Java, Python, React, Java, Python, React]
 OUTPUT: [Java, Python, React]
 ***********************************************************************/