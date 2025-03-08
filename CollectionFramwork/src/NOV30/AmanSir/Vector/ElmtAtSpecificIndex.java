package NOV30.AmanSir.Vector;

import java.util.Scanner;
import java.util.Vector;

public class ElmtAtSpecificIndex {
    public static void main(String[] args) {
        Vector<String> ob = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        ob.add("java");
        ob.add("python");
        ob.add("c");
        ob.add("html");
        ob.add("sql");
        ob.add("css");
        System.out.println("Vector: "+ob);
        System.out.print("Enter Index: ");
        int n= sc.nextInt();
        System.out.print("Element at "+n+" index is: "+ob.elementAt(n));
    }
}
