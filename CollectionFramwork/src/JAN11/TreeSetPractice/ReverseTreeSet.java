package JAN11.TreeSetPractice;

import java.util.Iterator;
import java.util.TreeSet;

public class ReverseTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ob = new TreeSet<>();
        ob.add("java");
        ob.add("python");
        ob.add("c");
        ob.add("css");
        ob.add("javascript");
        System.out.println("Tree Set: "+ob);
        Iterator<String> it = ob.descendingIterator();
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

    }
}
