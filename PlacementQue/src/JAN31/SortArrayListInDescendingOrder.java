package JAN31;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListInDescendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(5);
        ob.add(7);
        ob.add(3);
        ob.add(5);
        ob.add(6);
        ob.add(7);
        System.out.println("ArrayList: "+ob);
        Collections.sort(ob);
        Collections.reverse(ob);
        System.out.println("Descending order: "+ob);
    }
}
