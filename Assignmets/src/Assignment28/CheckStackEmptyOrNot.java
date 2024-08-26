/*1. Write a Java program to implement a stack with push and pop operations.
Find the top element of the stack and check if it is empty or not.*/
package Assignment28;

import java.util.Stack;

public class CheckStackEmptyOrNot {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        ob.push(5);
        ob.push(9);
        ob.push(15);
        ob.push(43);
        ob.push(3);
        ob.push(89);
        System.out.println("Stack: "+ob);
        System.out.println("Top Element: "+ob.peek());
        System.out.println("Stack is empty: "+ob.isEmpty());

    }
}
/***************************OUTPUT***************************
 Stack: [5, 9, 15, 43, 3, 89]
 Top Element: 89
 Stack is empty:false
*************************************************************/