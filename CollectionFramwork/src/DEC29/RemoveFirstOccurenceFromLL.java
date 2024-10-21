/*
3.Question:
Write a Java method that removes the first occurrence of a given element from an existing LinkedList.

public static void removeElement(LinkedList<Integer> list, int value) {
    // Your code here
}
*/
package DEC29;

import java.util.LinkedList;

public class RemoveFirstOccurenceFromLL {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(3);
        LL.add(5);
        LL.add(6);
        LL.add(5);
        LL.add(3);
        System.out.println("Original LL: "+LL);
        LL.removeFirstOccurrence(5);
        System.out.println("after removing first occurrence of 5: "+LL);
    }
}
