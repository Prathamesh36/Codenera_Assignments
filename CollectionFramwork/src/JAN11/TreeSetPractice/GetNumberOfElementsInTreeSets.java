/*7. Write a Java program to get the number of elements in a tree set.*/
package JAN11.TreeSetPractice;

import java.util.TreeSet;

public class GetNumberOfElementsInTreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> ob = new TreeSet<>();
        ob.add(65);
        ob.add(30);
        ob.add(26);
        ob.add(55);
        System.out.println("Tree Set: "+ob);
        System.out.println("Number os Elements: "+ob.size());
    }
}
