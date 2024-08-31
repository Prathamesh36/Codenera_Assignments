/*23. Write a Java program that implements a stack and creates a new stack
that contains all elements from two stacks without duplicates.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class UnionOfTwoStacks {
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
        while(!ob.isEmpty()){
            if(!ob2.contains(ob.peek())){
                ob2.push(ob.peek());
            }
            ob.pop();
        }
        while(!ob1.isEmpty()){
            if(!ob2.contains(ob1.peek())){
                ob2.push(ob1.peek());
            }
            ob1.pop();
        }
        System.out.println("Union Of Stacks: "+ob2);
    }
}
/***************************OUTPUT***************************
 Enter 5 elements for stack 1: 5 8 4 4 7
 Enter 5 elements for stack 2: 2 4 3 7 1
 Stack 1: [5, 8, 4, 4, 7]
 Stack 2: [2, 4, 3, 7, 1]
 Union Of Stacks: [7, 4, 8, 5, 1, 3, 2]
 *************************************************************/