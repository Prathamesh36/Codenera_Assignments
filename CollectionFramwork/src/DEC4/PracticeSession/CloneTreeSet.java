package DEC4.PracticeSession;

import java.util.TreeSet;

public class CloneTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ob = new TreeSet<>();
        ob.add(65);
        ob.add(30);
        ob.add(26);
        ob.add(55);
        System.out.println("Tree Set: "+ob);
        System.out.println("Clone Tree Set: "+ob.clone());
    }
}
