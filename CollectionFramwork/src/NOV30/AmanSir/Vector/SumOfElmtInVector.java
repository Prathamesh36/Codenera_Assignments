package NOV30.AmanSir.Vector;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class SumOfElmtInVector {
    public static void main(String[] args) {
        Vector<Integer> ob = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        ob.add(5);
        ob.add(6);
        ob.add(8);
        ob.add(7);
        ob.add(3);
        ob.add(4);
        System.out.println("Vector: "+ob);
        Iterator<Integer> ob1 = ob.iterator();
        int sum=0;
        while(ob1.hasNext()){
            sum+=ob1.next();
        }
        System.out.print("Sum of elements is: "+sum);
    }
}
