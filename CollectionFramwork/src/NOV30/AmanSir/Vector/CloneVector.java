package NOV30.AmanSir.Vector;


import java.util.Vector;
public class CloneVector {
    public static void main(String[] args) {
        Vector<Integer> ob = new Vector<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(8);
        ob.add(7);
        ob.add(3);
        ob.add(4);
        System.out.println("Original vector "+ob);
        Vector<Integer> ob1 = new Vector<Integer>(ob);
        System.out.println("Cloned vector "+ob1);
    }
}
