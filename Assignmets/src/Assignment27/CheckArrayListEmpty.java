/*4.Write a program to check if an ArrayList is empty.*/
package Assignment27;

import java.util.ArrayList;

public class CheckArrayListEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(8);
        ob.add(7);
        ob.clear();
        if(ob.isEmpty()) System.out.print("ArrayList is Empty");
        else System.out.print("ArrayList is not Empty");

    }
}
/**************************OUTPUT*****************************
 ArrayList is Empty
 ************************************************************/