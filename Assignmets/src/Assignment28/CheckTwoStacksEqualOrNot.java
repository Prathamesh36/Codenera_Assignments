/*20. Write a Java program that implements a stack and checks if two stacks
are equal.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class CheckTwoStacksEqualOrNot {
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

        while(!ob1.isEmpty()){
            if(ob.contains(ob1.peek())){
                c++;
            }
            ob1.pop();

        }
        if(c==m1-1){
            System.out.println("Both Stacks are equal");
        }
        else{
            System.out.println("Both Stacks are not equal");

        }
    }
}
/***************************OUTPUT***************************
 Enter 5 elements for stack 1: 5 2 1 3 4
 Enter 5 elements for stack 2: 1 2 3 4 5
 Stack 1: [5, 2, 1, 3, 4]
 Stack 2: [1, 2, 3, 4, 5]
 Both Stacks are equal
 *************************************************************/