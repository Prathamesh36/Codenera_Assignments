package DEC1.HashSet;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Integer> ob = new HashSet<>();
        ob.add(6);
        ob.add(4);
        ob.add(9);
        ob.add(5);
        ob.add(2);
        System.out.println("HashSet: "+ob);
        System.out.println("Is empty: "+ob.isEmpty());
        System.out.println("Total Length: "+ob.size());
        System.out.println("Clone: "+ob.clone());
        System.out.println("contains 9 or not: "+ob.contains(9));


    }
}
