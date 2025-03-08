/*Q7.Given a list of integers, use a lambda expression to filter out the odd numbers and return a new list.*/
package Test13;

import java.util.ArrayList;
import java.util.List;

public class FilterOutOddEvenUsingLamdaExp {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(4);
        ob.add(5);
        ob.add(3);
        ob.add(2);
        ob.add(1);
        ob.add(9);
        System.out.println("Original List: " + ob);
        List OddNo =ob.stream().filter(n->n%2==1).toList();
        System.out.print("Odd Numbers: "+OddNo);
    }
}
/************************OUTPUT*************************
 Original List: [4, 5, 3, 2, 1, 9]
 Odd Numbers: [5, 3, 1, 9]
 ********************************************************/