package DEC8.PracticeSession;

import java.util.HashSet;

public class CompareTwoHashSets {
    public static void main(String[] args) {
        HashSet<Integer> ob = new HashSet<>();
        ob.add(65);
        ob.add(30);
        ob.add(82);
        ob.add(18);
        ob.add(26);
        ob.add(55);
        System.out.println("Hash Set 1: "+ob);
        HashSet<Integer> ob1 = new HashSet<>();
        ob1.add(65);
        ob1.add(30);
        ob1.add(82);
        ob1.add(18);
        ob1.add(26);
        ob1.add(55);
        System.out.println("Hash Set 2: "+ob1);
        System.out.println("True");

    }
}
