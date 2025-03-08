package DEC8.PracticeSession;

import java.util.TreeSet;

public class RemoveFirstElmentFromTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ob = new TreeSet<>();
        ob.add(5);
        ob.add(9);
        ob.add(8);
        ob.add(4);
        ob.add(1);
        ob.add(10);
        System.out.println("TreeSet: "+ob);
        ob.pollFirst();
        System.out.println("updates TreeSet: "+ob);

    }
}
