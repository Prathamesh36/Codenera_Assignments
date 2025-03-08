package DEC8.PracticeSession;

import java.util.HashSet;

public class FindCommonElementsInHashSet {
    public static void main(String[] args) {
        HashSet<Integer> ob = new HashSet<>();
        ob.add(65);
        ob.add(30);
        ob.add(82);
        ob.add(44);
        System.out.println("Hash Set 1: "+ob);
        HashSet<Integer> ob1 = new HashSet<>();
        ob1.add(67);
        ob1.add(30);
        ob1.add(82);
        ob1.add(55);
        System.out.println("Hash Set 2: "+ob1);
        HashSet<Integer> ob2 = new HashSet<>();
        for (Integer el :ob) {
            if(ob1.contains(el)){
                ob2.add(el);
            }
        }
        System.out.println(ob2);
    }
}
