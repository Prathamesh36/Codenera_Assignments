package DEC4.PracticeSession;

import java.util.HashSet;
import java.util.TreeSet;

public class ConvertHashToTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> ob = new HashSet<>();
        ob.add(65);
        ob.add(30);
        ob.add(82);
        ob.add(18);
        ob.add(26);
        ob.add(55);
        System.out.println("Hash Set: "+ob);
        TreeSet<Integer> a= new TreeSet<Integer>(ob);
        System.out.println("Tree Set: "+a);
    }
}
