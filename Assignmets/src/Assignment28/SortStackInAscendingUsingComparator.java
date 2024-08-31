/*2. Write a Java program to sort the elements of a given stack in ascending
order.*/
package Assignment28;

import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class SortStackInAscendingUsingComparator {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        ob.push(45);
        ob.push(9);
        ob.push(12);
        ob.push(4);
        ob.push(30);
        ob.push(8);
        System.out.println("Stack: "+ob);
        Collections.sort(ob, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        Stack<Integer> ob1 =new Stack<>();
        while(!ob.isEmpty()){
            int a = ob.pop();
            ob1.push(a);
        }
        System.out.println("Sorted in Ascending: "+ob1);

    }
}
/***************************OUTPUT***************************
 Stack: [45, 9, 12, 4, 30, 8]
 Sorted in Ascending: [4, 8, 9, 12, 30, 45]
 *************************************************************/