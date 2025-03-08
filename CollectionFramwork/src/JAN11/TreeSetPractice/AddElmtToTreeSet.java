/*1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.*/
package JAN11.TreeSetPractice;

import java.util.TreeSet;

public class AddElmtToTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ob = new TreeSet<>();
        ob.add("java");
        ob.add("python");
        ob.add("c");
        ob.add("css");
        ob.add("javascript");
        System.out.println("Tree Set: "+ob);
    }
}
