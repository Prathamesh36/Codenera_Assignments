/*4.Question:
Write a Java method that checks if a specific element exists in a LinkedList.

public static boolean containsElement(LinkedList<Integer> list, int value) {
    // Your code here
}*/
package DEC29;

import java.util.LinkedList;

public class CheckSpecifiedElmtPresentOrNot {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(3);
        LL.add(5);
        LL.add(6);
        LL.add(5);
        LL.add(3);
        System.out.println("Original LL: "+LL);

        System.out.println("1 Present Or not: "+LL.contains(1));
    }
}
