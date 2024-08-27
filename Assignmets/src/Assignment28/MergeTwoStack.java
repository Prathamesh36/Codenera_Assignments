/*18. Write a Java program to merge two stacks into one.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class MergeTwoStack {
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
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter 5 elements for stack 2: ");
        int m1=1;
        while(m1<=5){
            ob1.push(sc.nextInt());
            m1++;
        }
        System.out.println("Stack 1: "+ob);
        System.out.println("Stack 2: "+ob1);
        while(!ob1.isEmpty()){
            ob.push(ob1.peek());
            ob1.pop();
        }
        System.out.println("Merged Stack: "+ob);
    }
}
/***************************OUTPUT***************************
 Enter 5 elements for stack 1: 1 2 3 4 5
 Enter 5 elements for stack 2: 10 9 8 7 6
 Stack 1: [1, 2, 3, 4, 5]
 Stack 2: [10, 9, 8, 7, 6]
 Merged Stack: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 *************************************************************/