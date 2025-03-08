/*Q.6 Wap to sort hashset in decending form using stream api*/
package Test12;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class SortHashSetInDescendingOrder {
    public static void main(String[] args) {
        HashSet<Integer> ob = new HashSet<>();
        ob.add(4);
        ob.add(5);
        ob.add(9);
        ob.add(1);
        ob.add(0);
        System.out.println("HashSet: "+ob);
        List<Integer> ob1 = ob.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Reverse: "+ob1);
    }
}
/*************************OUTPUT****************************
 HashSet: [0, 1, 4, 5, 9]
 Reverse: [9, 5, 4, 1, 0]
 ************************************************************/