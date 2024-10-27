package DEC4.PracticeSession;

import java.util.HashSet;

public class RemoveAllFromHashSet {
    public static void main(String[] args) {
        HashSet<Integer> ob = new HashSet<>();
        ob.add(65);
        ob.add(30);
        ob.add(82);
        ob.add(18);
        ob.add(26);
        ob.add(55);
        System.out.println("Hash Set: "+ob);
        ob.clear();
        System.out.println("Hash Set: "+ob);

    }
}
