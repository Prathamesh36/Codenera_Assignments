/*13. Write a Java program to remove a specific element from a stack.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class RemoveSpecificElmtFromStack {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 7 stack elements: ");
        int n=1;
        while(n<=7){
            ob.push(sc.nextInt());
            n++;
        }
        System.out.println("Original Stack: "+ob);
        System.out.print("Enter Element to remove: ");
        int r = sc.nextInt();
        ob.remove((Integer) r);
        System.out.println("After removing "+r+" from Stack: "+ob);
    }
}
/***************************OUTPUT***************************
 Enter 7 stack elements: 4 2 9 1 3 7 6
 Original Stack: [4, 2, 9, 1, 3, 7, 6]
 Enter Element to remove: 9
 After removing 9 from Stack: [4, 2, 1, 3, 7, 6]
 *************************************************************/