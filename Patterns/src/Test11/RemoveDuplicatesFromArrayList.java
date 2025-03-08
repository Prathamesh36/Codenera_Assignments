/*2.Write a program to remove duplicates from an ArrayList.*/
package Test11;

import java.util.ArrayList;

public class RemoveDuplicatesFromArrayList {
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
        ArrayList<Integer> ob1 = new ArrayList<Integer>();
        for (Integer a: ob) {
            if(!ob1.contains(a)){
                ob1.add(a);
            }
        }
        System.out.println("After Removing Duplicate Elements: "+ob1);


    }
}
/****************************OUTPUT***********************************
 ArrayList: [5, 6, 5, 7, 3, 5, 6, 7]
 After Removing Duplicate Elements: [5, 6, 7, 3]
 *********************************************************************/