package DEC8.PracticeSession;

import java.util.TreeSet;

public class NumberLessThan7InTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ob = new TreeSet<>();
        ob.add(5);
        ob.add(9);
        ob.add(8);
        ob.add(4);
        ob.add(1);
        ob.add(10);
        System.out.println("TreeSet: "+ob);
        TreeSet<Integer> ob1 = new TreeSet<>();
        for(Integer el : ob){
            if(el<7){
                ob1.add(el);
            }
        }
        System.out.println("Less than 7: "+ob1);

    }
}
