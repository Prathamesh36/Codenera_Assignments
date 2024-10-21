package DEC4.No;

import java.util.TreeSet;

public class OfElementsInTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ob = new TreeSet<>();
        ob.add(65);
        ob.add(30);
        ob.add(26);
        ob.add(55);
        System.out.println("Tree Set: "+ob);
        System.out.println("No. of Elements: "+ob.size());
    }
}
