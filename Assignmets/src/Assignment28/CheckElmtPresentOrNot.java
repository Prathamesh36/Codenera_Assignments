/*8. Write a Java program to implement a stack that checks if a given element is
present or not in the stack.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class CheckElmtPresentOrNot {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        Scanner sc = new Scanner(System.in);
        ob.push(43);
        ob.push(22);
        ob.push(78);
        ob.push(11);
        ob.push(59);
        ob.push(60);
        System.out.println("Stack: "+ob);
        System.out.print("Enter Element to check present or not: ");
        int n = sc.nextInt();
        int c=0;
        while(!ob.isEmpty()){
            if(n==ob.peek()) {
                c++;
            }
            ob.pop();
        }
        if(c!=0) System.out.println("Element present");
        else System.out.println("Element not present");

    }
}
/***************************OUTPUT***************************
 Stack: [43, 22, 78, 11, 59, 60]
 Enter Element to check present or not: 22
 Element present
 *************************************************************/