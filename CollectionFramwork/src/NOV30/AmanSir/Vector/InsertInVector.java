package NOV30.AmanSir.Vector;

import java.util.Scanner;
import java.util.Vector;

public class InsertInVector {
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
        System.out.print("Enter Index: ");
        int n= sc.nextInt();
        System.out.print("Enter element to insert: ");
        int i= sc.nextInt();

        ob.insertElementAt(i,n);
        System.out.print("Updated Vector: "+ob);
    }
}
