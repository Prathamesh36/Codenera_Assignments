/*Q.15. Add an element to specified index of Java ArrayList Example*/
package Test12;

import java.util.ArrayList;
import java.util.Scanner;

public class AddElmtToIndexOfAL {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(9);
        ob.add(4);
        ob.add(5);
        ob.add(1);
        ob.add(0);
        System.out.println("ArrayList: "+ob);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index to insert : ");
        int b=sc.nextInt();
        System.out.print("Enter element to insert : ");
        int c=sc.nextInt();
        ob.add(b,c);
        System.out.print("After insertion: "+ob);

    }
}
/*************************OUTPUT****************************
 ArrayList: [9, 4, 5, 1, 0]
 Enter index to insert : 2
 Enter element to insert : 88
 After insertion: [9, 4, 88, 5, 1, 0]
 ************************************************************/