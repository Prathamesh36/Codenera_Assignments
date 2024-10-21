/*1.Question:
Write a Java method that appends a new element with a given value to the end of an existing LinkedList.

public static void appendToEnd(LinkedList<Integer> list, int value) {

}*/
package DEC29;

import java.util.LinkedList;

public class AppendelmtAtEnd {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(3);
        LL.add(5);
        LL.add(6);
        LL.add(7);
        LL.add(2);
        System.out.println("Original LL: "+LL);
        LL.add(11);
        System.out.println("Updated LL: "+LL);
    }
}
