/*2. Write a Java program to iterate through all elements in a tree set.*/
package JAN11.TreeSetPractice;

import java.util.TreeSet;

public class IterateThroughTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ob = new TreeSet<>();
        ob.add("java");
        ob.add("python");
        ob.add("c");
        ob.add("css");
        ob.add("javascript");
        System.out.println("Tree Set: "+ob);
        for (String s : ob) {
            System.out.println(s);
        }
    }
}
