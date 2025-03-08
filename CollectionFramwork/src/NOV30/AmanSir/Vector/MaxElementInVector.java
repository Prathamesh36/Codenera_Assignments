package NOV30.AmanSir.Vector;

import java.util.Vector;

public class MaxElementInVector {
    public static void main(String[] args) {
        Vector<Integer> ob = new Vector<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(8);
        ob.add(7);
        ob.add(3);
        ob.add(4);
        System.out.println("Vector: "+ob);
        int max = ob.get(0);
        for (int i = 0; i < ob.size(); i++) {
            if(ob.get(i)>max) max=ob.get(i);
        }
        System.out.print("Maximum Element in Vector: "+max);

    }
}
