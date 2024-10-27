package DEC4.PracticeSession;

import java.util.TreeSet;

public class IterateThroughAllElementsOfTreeSet {
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
