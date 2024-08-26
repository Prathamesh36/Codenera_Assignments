/*19. Write a JavaScript program that implements a stack and checks if the
stack is a subset of another stack.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class CheckSubsetOfAnotherStack {
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
        System.out.print("Enter 3 elements for stack 2: ");
        int m1=1;
        while(m1<=3){
            ob1.push(sc.nextInt());
            m1++;
        }
        System.out.println("Stack 1: "+ob);
        System.out.println("Stack 2: "+ob1);
        int c=0;

        while(!ob1.isEmpty()){
           // System.out.println(ob.contains(ob1.peek()));
            if(ob.contains(ob1.peek())){
                c++;
            }
            ob1.pop();

        }
        if(c==m1-1){
            System.out.println("Stack 2 is Subset of Stack 1");
        }
        else{
            System.out.println("Stack 2 is not Subset of Stack 1");
        }
    }
}
/***************************OUTPUT***************************
 Enter 5 elements for stack 1: 1 2 3 4 5
 Enter 3 elements for stack 2: 2 3 4
 Stack 1: [1, 2, 3, 4, 5]
 Stack 2: [2, 3, 4]
 Stack 2 is Subset of Stack 1
 *************************************************************/