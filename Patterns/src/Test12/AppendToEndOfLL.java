/*Q.12 Write a Java method that appends a new element with a given value to the end of an existing LinkedList.

public static void appendToEnd(LinkedList<Integer> list, int value) {
    // Your code here
}*/
package Test12;

import java.util.LinkedList;
import java.util.Scanner;


public class AppendToEndOfLL {

    public static void appendToEnd(LinkedList<Integer> ob, int a) {
        ob.addLast(a);
        System.out.print("After adding element at last : "+ob);
    }

    public static void main(String[] args) {
        LinkedList<Integer> ob=new LinkedList<>();
        ob.add(3);
        ob.add(5);
        ob.add(2);
        ob.add(9);
        ob.add(6);
        System.out.println("LinkedList : "+ob);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any element to insertion : ");
        int a=sc.nextInt();

        appendToEnd(ob,a);

    }
}
/*************************OUTPUT****************************
 LinkedList : [3, 5, 2, 9, 6]
 Enter any element to insertion : 88
 After adding element at last : [3, 5, 2, 9, 6, 88]
 ************************************************************/