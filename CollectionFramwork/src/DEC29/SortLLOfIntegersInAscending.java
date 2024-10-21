/*8.Question:
Write a Java method that sorts a LinkedList of integers in ascending order.

public static void sortLinkedList(LinkedList<Integer> list) {
    // Your code here
}*/
package DEC29;

import java.util.Collections;
import java.util.LinkedList;

public class SortLLOfIntegersInAscending {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(3);
        LL.add(5);
        LL.add(6);
        LL.add(9);
        LL.add(1);
        System.out.println("Original LL: "+LL);
        Collections.sort(LL);
        System.out.println("Sorted LL: "+LL);
    }
}
