package DEC4.PracticeSession;

import java.util.HashSet;

public class ConvertHashSetIntoArray {
    public static void main(String[] args) {
        HashSet<Integer> ob = new HashSet<>();
        ob.add(6);
        ob.add(3);
        ob.add(8);
        ob.add(1);
        ob.add(2);
        ob.add(5);
        System.out.println("Hash Set: "+ob);
        System.out.print("Array: ");
        Object[] a= ob.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
