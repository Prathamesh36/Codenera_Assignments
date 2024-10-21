/*5.Question:
Write a Java method that reverses the elements of an existing LinkedList.

public static void reverseLinkedList(LinkedList<Integer> list) {
    // Your code here
}

*/
package DEC29;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLL {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(3);
        LL.add(5);
        LL.add(6);
        LL.add(9);
        LL.add(1);
        System.out.println("Original LL: "+LL);
        Collections.reverse(LL);
        System.out.println("Reverse LL: "+LL);

    }
}
