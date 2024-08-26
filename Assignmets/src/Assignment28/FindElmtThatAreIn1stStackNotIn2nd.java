/*22. Write a Java program that implements a stack and find elements that are
in the first stack but not in the second stack.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class FindElmtThatAreIn1stStackNotIn2nd {
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
            if(!ob1.contains(ob.peek())){
                ob2.push(ob.peek());
            }
            ob.pop();
        }
        System.out.println("Elements that are in stack 1 not in stack 2: "+ob2);
    }
}
/***************************OUTPUT***************************
 Enter 5 elements for stack 1: 8 9 2 1 7
 Enter 5 elements for stack 2: 4 7 6 9 5
 Stack 1: [8, 9, 2, 1, 7]
 Stack 2: [4, 7, 6, 9, 5]
 Elements that are in stack 1 not in stack 2: [1, 2, 8]
 *************************************************************/