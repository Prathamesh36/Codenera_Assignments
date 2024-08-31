/*14. Write a Java program to swap the top two elements of a given stack.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class SwapTopTwoElmtOfStack {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 7 stack elements: ");
        int n=1;
        while(n<=7){
            ob.push(sc.nextInt());
            n++;
        }
        System.out.println("Original Stack: "+ob);
        int temp1=ob.pop();
        int temp=ob.pop();
        ob.push(temp1);
        ob.push(temp);
        System.out.println("Stack After swapping top two elements: ");
        System.out.println(ob);
    }
}
/***************************OUTPUT***************************
 Enter 7 stack elements: 2 4 8 6 1 9 3
 Original Stack: [2, 4, 8, 6, 1, 9, 3]
 Stack After swapping top two elements:
 [2, 4, 8, 6, 1, 3, 9]
 *************************************************************/