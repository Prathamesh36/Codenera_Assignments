/*Q.13 Wap to remove the element at a given index in an ArrayList?*/
package Test12;

import java.util.ArrayList;
import java.util.Scanner;


public class RemoveElmtFromGivenIndexFromAL {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(9);
        ob.add(4);
        ob.add(5);
        ob.add(1);
        ob.add(0);
        System.out.println("ArrayList: "+ob);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index to remove: ");
        int b=sc.nextInt();
        ob.remove(b);
        System.out.println("After removing element : "+ob);

    }
}
/*************************OUTPUT****************************
 ArrayList: [9, 4, 5, 1, 0]
 Enter index to remove: 2
 After removing element : [9, 4, 1, 0]
 ************************************************************/