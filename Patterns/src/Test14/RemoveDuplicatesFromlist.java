/*2.	Write a program that takes a list of integers and returns a new list containing
only the unique elements in the original list.*/
package Test14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromlist {
    public static void main(String[] args) {
        List<Integer> ob = new ArrayList<>();
        ob.add(2);
        ob.add(5);
        ob.add(1);
        ob.add(2);
        ob.add(2);
        ob.add(5);
        System.out.println("Original List: "+ob);
        HashSet<Integer> ob1 = new HashSet(ob);
        ob.clear();
        ob.addAll(ob1);
        System.out.println("Unique Elements:"+ob);
    }
}
/***********************OUTPUT*************************
 Original List: [2, 5, 1, 2, 2, 5]
 Unique Elements:[1, 2, 5]
 *******************************************************/