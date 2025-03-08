/*3. Write a Java program to add all the elements of a specified tree set to another tree set.
*/
package JAN11.TreeSetPractice;

import java.util.TreeSet;

public class AddElmtToTreeSetOfAnotherTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ob = new TreeSet<>();
        ob.add("java");
        ob.add("python");
        ob.add("c");
        ob.add("css");
        ob.add("javascript");
        System.out.println("Tree Set: "+ob);
        TreeSet<String> ob1 = new TreeSet<>(ob);
        System.out.println("Another Tree Set: "+ob);

    }
}
