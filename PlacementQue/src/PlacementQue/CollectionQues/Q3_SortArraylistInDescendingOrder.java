/*Write a program to sort an ArrayList in descending order.*/
package PlacementQue.CollectionQues;

import java.util.ArrayList;
import java.util.Collections;

public class Q3_SortArraylistInDescendingOrder {
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
/****************************OUTPUT***********************************
 ArrayList: [5, 6, 5, 7, 3, 5, 6, 7]
 Descending order: [7, 7, 6, 6, 5, 5, 5, 3]
 *********************************************************************/