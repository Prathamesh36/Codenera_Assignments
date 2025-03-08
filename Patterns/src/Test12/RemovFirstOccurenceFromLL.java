/*Q.10 Write a Java method that removes the first occurrence of a given element from an existing LinkedList.*/
package Test12;

import java.util.LinkedList;
import java.util.Scanner;

public class RemovFirstOccurenceFromLL {

    public static void removeElement(LinkedList<Integer> ob, int a) {
        ob.removeFirstOccurrence(a);
        System.out.println("After removing first occurrence of "+a+", LinkedList is: "+ob);
    }

    public static void main(String[] args) {
        LinkedList<Integer> ob = new LinkedList<>();
        ob.add(9);
        ob.add(4);
        ob.add(5);
        ob.add(9);
        ob.add(9);
        ob.add(1);
        ob.add(0);
        System.out.println("LinkedList: "+ob);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element: ");
        int a = sc.nextInt();
        removeElement(ob,a);



    }
}
/*************************OUTPUT****************************
 LinkedList: [9, 4, 5, 9, 9, 1, 0]
 Enter Element: 9
 After removing first occurrence of 9, LinkedList is: [4, 5, 9, 9, 1, 0]
 ************************************************************/