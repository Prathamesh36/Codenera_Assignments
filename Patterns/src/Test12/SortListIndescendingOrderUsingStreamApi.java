/*Q.9 Given a list of integers, sort all the values present in it in descending order using Stream functions?*/
package Test12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortListIndescendingOrderUsingStreamApi {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(4);
        ob.add(5);
        ob.add(9);
        ob.add(1);
        ob.add(0);
        System.out.println("List: "+ob);
        List<Integer> ob1 = ob.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Reverse: "+ob1);
    }
}
/*************************OUTPUT****************************
 List: [0, 1, 4, 5, 9]
 Reverse: [9, 5, 4, 1, 0]
 ************************************************************/