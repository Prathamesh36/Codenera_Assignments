/*7. Removing Elements with Predicate:
   - Write a Java program to remove all elements that start with a specific letter from a list of strings using the removeIf method and a lambda expression.

*/
package PracticeArtiset.LambdaAndStreams.other;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveStringThatStartWithSpecificLetter {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("apple","mango","banana", "kiwi", "orange", "ant"));
        System.out.println("Original String: "+ al);
        char startingLetter = 'a';
        al.removeIf(a -> a.toLowerCase().startsWith(String.valueOf(Character.toLowerCase(startingLetter))));
        System.out.println("List after removal: "+al);
    }
}
