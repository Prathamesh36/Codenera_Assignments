/*25. Write a Java program that implements a stack and creates a new stack
that contains only elements that are in either the first or the second stack, but
not in both.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class ElmtThatAreNotInBothStacks {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 elements for stack 1: ");
        int m=1;
        while(m<=5){
            ob.push(sc.nextInt());
            m++;
        }
        Stack<Integer> ob1 =new Stack<>();
        System.out.print("Enter 5 elements for stack 2: ");
        int m1=1;
        while(m1<=5){
            ob1.push(sc.nextInt());
            m1++;
        }
        System.out.println("Stack 1: "+ob);
        System.out.println("Stack 2: "+ob1);
        int c=0;
        Stack<Integer> ob2 =new Stack<>();
        Stack<Integer> ob3 =new Stack<>();
        while(!ob1.isEmpty()){
            if(ob.contains(ob1.peek())){
                ob3.push(ob1.peek());
            }
            if(!ob.contains(ob1.peek())){
                ob2.push(ob1.peek());
            }
            ob1.pop();
        }
        while(!ob.isEmpty()){
            if(!ob1.contains(ob.peek()) && !ob3.contains(ob.peek())){
                ob2.push(ob.peek());
            }
            ob.pop();
        }
        System.out.println("UnCommon Elements: "+ob2);
    }
}
/***************************OUTPUT***************************
 Enter 5 elements for stack 1: 8 9 2 1 7
 Enter 5 elements for stack 2: 4 7 6 9 5
 Stack 1: [8, 9, 2, 1, 7]
 Stack 2: [4, 7, 6, 9, 5]
 UnCommon Elements: [5, 6, 4, 1, 2, 8]
 *************************************************************/