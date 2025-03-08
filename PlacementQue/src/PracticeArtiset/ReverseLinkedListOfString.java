package PracticeArtiset;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedListOfString {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("apple","mango","banana", "kiwi", "orange"));
        System.out.println("Original LinkedList: "+ll);
        Collections.reverse(ll);
        System.out.println("Reversed LinkedList: "+ll);

    }
}
