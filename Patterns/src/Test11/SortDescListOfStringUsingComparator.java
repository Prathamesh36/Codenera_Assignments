/*9. Given a list of strings, write a Java program to sort them alphabetically in descending order using a Comparator.*/
package Test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortDescListOfStringUsingComparator {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<String>();
        ob.add("java");
        ob.add("python");
        ob.add("c");
        ob.add("html");
        ob.add("css");
        ob.add("ruby");
        ob.add("sql");
        ob.add("react");
        System.out.println("StringList: "+ob);
        Collections.sort(ob, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("Sorted in Descending: "+ob);
    }
}
/****************************OUTPUT***********************************
 StringList: [java, python, c, html, css, ruby, sql, react]
 Sorted in Descending: [sql, ruby, react, python, java, html, css, c]
 *********************************************************************/