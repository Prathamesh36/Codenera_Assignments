package DEC4.PracticeSession;

import java.util.HashSet;

public class CloneHashSets {
    public static void main(String[] args) {
        HashSet<Integer> ob = new HashSet<>();
        ob.add(4);
        ob.add(6);
        ob.add(9);
        ob.add(2);
        ob.add(0);
        ob.add(1);
        System.out.println("Hash Set: "+ob);
        ob.clone();
        System.out.println("Clone Hashset: "+ob.clone());
    }
}
