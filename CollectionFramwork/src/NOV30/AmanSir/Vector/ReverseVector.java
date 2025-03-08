package NOV30.AmanSir.Vector;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ReverseVector {
    public static void main(String[] args) {
        Vector<Integer> ob = new Vector<Integer>();
        Vector<Integer> ob1 = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        ob.add(5);
        ob.add(6);
        ob.add(8);
        ob.add(7);
        ob.add(3);
        ob.add(4);
        System.out.println("Vector: "+ob);
        for (int i = ob.size()-1; i >=0 ; i--) {
            ob1.add(ob.get(i));
        }
        System.out.print("Reverse: "+ob1);
    }
}
