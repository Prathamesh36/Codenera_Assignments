/*2.Find the Intersection of Two ArrayLists:*/
package Assignment27;

import java.util.ArrayList;

public class InsertionOfTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(8);
        ob.add(7);
        ob.add(3);
        ob.add(4);
        System.out.println("ArrayList 1: "+ob);
        ArrayList<Integer> ob1= new ArrayList<Integer>();
        ob1.add(2);
        ob1.add(3);
        ob1.add(6);
        ob1.add(9);
        ob1.add(1);
        ob1.add(8);
        System.out.println("ArrayList 2: "+ob1);
        ob.retainAll(ob1);
        System.out.println("Intersection: "+ob);
    }
}
/**************************OUTPUT*****************************
 ArrayList 1: [5, 6, 8, 7, 3, 4]
 ArrayList 2: [2, 3, 6, 9, 1, 8]
 Intersection: [6, 8, 3]
 ************************************************************/
