/*17. Write a Java program to implement a stack and move the nth element
from the top of the stack to the top.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class Move_nthElmtFromTopToTop {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        Stack<Integer> ob1 =new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 7 stack elements: ");
        int m=1;
        while(m<=7){
            ob.push(sc.nextInt());
            m++;
        }
        System.out.println("Original Stack: "+ob);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            ob1.push(ob.peek());
            ob.pop();
        }
        System.out.println("nth Element from top is: "+ob.peek());
        int temp=ob.pop();
        while (!ob1.isEmpty()){
            ob.push(ob1.peek());
            ob1.pop();
        }
        ob.push(temp);
        System.out.println("Stack After moving nth top element to the top: ");
        System.out.println(ob);
    }
}
/***************************OUTPUT***************************
 Enter 7 stack elements: 4 5 6 9 1 2 7
 Original Stack: [4, 5, 6, 9, 1, 2, 7]
 Enter value of n: 4
 nth Element from top is: 9
 Stack After moving nth top element to the top:
 [4, 5, 6, 1, 2, 7, 9]
 *************************************************************/