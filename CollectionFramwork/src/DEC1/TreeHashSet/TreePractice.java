package DEC1.TreeHashSet;

import java.util.TreeSet;

public class TreePractice {
    public static void main(String[] args) {
        TreeSet<Integer> ob = new TreeSet<>();
        ob.add(55);
        ob.add(47);
        ob.add(10);
        ob.add(23);
        ob.add(98);
        ob.add(34);
        ob.add(22);
        ob.add(87);
        System.out.println("Tree: "+ob);
        System.out.println("clone: "+ob.clone());
        System.out.println("first: "+ob.first());
        System.out.println("higher of 22: "+ob.higher(22));
        System.out.println("lower of 22: "+ob.lower(22));
        System.out.println("isEmpty : "+ob.isEmpty());
        System.out.println("last : "+ob.last());
        ob.remove(55);
        System.out.println("After removing 55: "+ob);
        System.out.println("descendingSet: "+ob.descendingSet());



    }
}
/*encap class sort in tree by using comparaotr, comparable */