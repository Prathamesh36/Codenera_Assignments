/*Q.2 Write a Java method that checks if a specific element exists in a LinkedList.*/
package Test12;

import java.util.LinkedList;
import java.util.Scanner;

public class CheckElmtPresentInLL {

    public static boolean Search(LinkedList<Integer> ob,int a){
        if(ob.contains(a)){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedList<Integer> ob = new LinkedList<>();
        ob.add(4);
        ob.add(5);
        ob.add(9);
        ob.add(1);
        ob.add(0);
        System.out.println("LinkedList: "+ob);
        System.out.print("Enter Element to search: ");
        int a= sc.nextInt();
        System.out.println("Element Present: "+Search(ob,a));
    }
}
/*************************OUTPUT****************************
 LinkedList: [4, 5, 9, 1, 0]
 Enter Element to search: 5
 Element Present: true
 ************************************************************/