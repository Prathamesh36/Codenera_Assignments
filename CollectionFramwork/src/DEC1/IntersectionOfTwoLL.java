package DEC1;

import java.util.LinkedList;

public class IntersectionOfTwoLL {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<Integer>();
        LL.add(60);
        LL.add(22);
        LL.add(39);
        LL.add(40);
        LL.add(90);
        System.out.println(LL);
        LinkedList<Integer> LL1 = new LinkedList<Integer>();
        LL1.add(35);
        LL1.add(90);
        LL1.add(60);
        LL1.add(42);
        LL1.add(65);
        System.out.println(LL1);
        LL1.retainAll(LL);
        System.out.println("Intersection: "+LL1);
    }
}
