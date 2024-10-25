package DEC4.PracticeSession;

import java.util.TreeSet;

public class FirstAndLastElmtOfTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ob = new TreeSet<>();
        ob.add(65);
        ob.add(30);
        ob.add(82);
        ob.add(18);
        ob.add(26);
        ob.add(55);
        System.out.println("Tree Set: "+ob);
        System.out.println("First Element: "+ob.first());
        System.out.println("Last Element: "+ob.last());
    }
}
