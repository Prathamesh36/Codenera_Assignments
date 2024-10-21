package DEC4.AmanSir;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ob = new LinkedHashSet<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(7);
        ob.add(9);
        ob.add(2);
        System.out.println("LinkedHashSet: "+ob);
        System.out.println("Clone: "+ob.clone());
        System.out.println("IsEmpty: "+ob.isEmpty());
        System.out.println("Size: "+ob.size());
        ob.remove(5);
        System.out.println("Remove first Element: "+ob);
        ob.clear();
        System.out.println("Clear: "+ob);



    }
}
