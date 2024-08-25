/*6.Sort an ArrayList of Strings in ascending order.*/
package Assignment27;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListOfString {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<String>();
        ob.add("java");
        ob.add("python");
        ob.add("html");
        ob.add("css");
        ob.add("sql");
        ob.add("c");
        ob.add("javascript");
        ob.add("ruby");
        System.out.println("String ArrayList: "+ob);
        Collections.sort(ob);
        System.out.println("Ascending order: "+ob);
    }
}
/**************************OUTPUT*****************************
 String ArrayList: [java, python, html, css, sql, c, javascript, ruby]
 Ascending order: [c, css, html, java, javascript, python, ruby, sql]
 ************************************************************/