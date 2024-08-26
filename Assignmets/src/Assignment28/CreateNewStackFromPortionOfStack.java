/*24. Write a Java program that implements a stack and creates a new stack
from a portion of the original stack.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class CreateNewStackFromPortionOfStack {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 8 elements for stack 1: ");
        int m=1;
        while(m<=8){
            ob.push(sc.nextInt());
            m++;
        }
        System.out.println("Stack 1: "+ob);
        Stack<Integer> ob1 =new Stack<>();
        System.out.println("We are creating new stack using 4 elements of stack 1");
        int x=1;
        while(x<=4){
            ob1.push(ob.peek());
            ob.pop();
            x++;
        }
        System.out.println("Stack 1: "+ob);
        System.out.println("Stack 2: "+ob1);
    }
}
/***************************OUTPUT***************************
 Enter 8 elements for stack 1: 1 2 3 4 5 6 7 8
 Stack 1: [1, 2, 3, 4, 5, 6, 7, 8]
 We are creating new stack using 4 elements of stack 1
 Stack 1: [1, 2, 3, 4]
 Stack 2: [8, 7, 6, 5]
 *************************************************************/